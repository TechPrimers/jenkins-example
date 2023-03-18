pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven-siddu') {
                    sh '/usr/share/maven mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven-siddu') {
                    sh '/usr/share/maven mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven-siddu') {
                    sh '/usr/share/maven mvn deploy'
                }
            }
        }
    }
}
