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

    /*    stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn test'
                }
            }
        }
*/

        stage ('Deployment Stage') {
            steps {
                sh 'cd target'
                sh '/usr/local/bin/aws s3 cp jenkins-example-1.0-SNAPSHOT.jar s3://techprimers-s3/'
                sh '/usr/local/bin/aws s3 ls'
                sh '/usr/local/bin/aws s3 ls s3://techprimers-s3/'
            }
        }
    }
}