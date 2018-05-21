pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'MAVEN_HOME') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'MAVEN_HOME') {
                    bat 'mvn test'
                }
            }
            post{
               failure {
                          mail(from: "paul.mriganka@gmail.com",
                                     to: paul.mriganka@gmail.com",
                                     subject: "That build failed.",
                                     body: "Nothing to see here")
                       }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'MAVEN_HOME') {
                    bat 'mvn deploy'
                }
            }
        }
    }
}