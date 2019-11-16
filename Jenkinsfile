pipeline {
    agent any
 triggers {
        githubPush()
    }

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven 3.6.2') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven 3.6.2') {
                    sh 'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven 3.6.2') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}
