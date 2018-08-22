pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
// Fase De Compilacion
            steps {
                withMaven(maven : 'maven 3.5.4') {
                    sh 'mvn clean compile'
                }
            }
        }
// Fase De Test
        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven 3.5.4') {
                    sh 'mvn test'
                }
            }
        }

// Fase Deploy
        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven 3.5.4') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}
