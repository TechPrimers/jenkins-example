pipeline {
    agent any

    stages {
        stage ('SCM Checkout') {
            git 'https://github.com/nalluriavinash5/jenkinsAssignment'
        }

        stage ('Complile - Package') {
            steps {
                withMaven(maven : 'maven_3_6_3') {
                    sh 'mvn package'
                }
            }
        }
    }
}
