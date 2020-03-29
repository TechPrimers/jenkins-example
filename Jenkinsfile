pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn test'
                }
            }
        }

        stage ('Deploy?') {
            steps {
                echo "deploy? stage completed successfully"
            }
        }

        stage ('Deployment Stage') {
            steps {

		   echo "deployment stage completed successfully"
                }
            }
        }
    }
}
