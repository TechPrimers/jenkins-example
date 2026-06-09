pipeline {
    agent any
    stages {
        stage('Compile Stage') {
            steps {
                echo 'Compiling...'
            }
        }
        stage('Testing Stage') {
            steps {
                echo 'Running tests...'
            }
        }
        stage('Deployment Stage') {
            steps {
                echo 'Deploying...'
                sh 'echo "Deploy done ✅"'
            }
        }
    }
}
