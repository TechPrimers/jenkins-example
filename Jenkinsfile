pipeline {
    agent any

    stages {

        stage('Compile Stage') {
            steps {
                withMaven(maven: 'maven_3_5_0') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Testing Stage') {
            steps {
                withMaven(maven: 'maven_3_5_0') {
                    sh 'mvn test'
                }
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {   // must match name configured in Jenkins
                    withMaven(maven: 'maven_3_5_0') {
                        sh '''
                            mvn sonar:sonar \
                              -Dsonar.projectKey=jenkins-example \
                              -Dsonar.projectName="Jenkins Example" \
                              -Dsonar.sources=src/main/java \
                              -Dsonar.tests=src/test/java \
                              -Dsonar.java.binaries=target/classes
                        '''
                    }
                }
            }
        }

        stage('Quality Gate') {
            steps {
                timeout(time: 5, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }

        stage('Deployment Stage') {
            steps {
                withMaven(maven: 'maven_3_5_0') {
                    sh 'mvn deploy'
                }
            }
        }

    }
}
```

---

## Step 6: Run the Pipeline

1. Go to your `jenkins-example` job
2. Click **Build Now**
3. Click the build number → **Console Output** to watch it live

You should see all 5 stages execute in sequence:
```
✅ Compile Stage
✅ Testing Stage
✅ SonarQube Analysis
✅ Quality Gate
✅ Deployment Stage
