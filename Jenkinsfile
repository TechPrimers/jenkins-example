pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage ('Testing Stage') {
            steps {
                sh 'mvn test'
            }
        }


        stage ('Package & Save Artifact') {
            steps {
                // 1. 'package' builds the .jar file
                sh 'mvn clean package'
                
                // 2. This tells Jenkins to save the .jar file so you can download it from the UI
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}