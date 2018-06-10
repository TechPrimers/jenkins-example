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

            withCredentials([usernamePassword(credentialsId: 's3-bucket', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
              sh 'export AWS_ACCESS_KEY_ID=$USERNAME'
              sh 'export AWS_SECRET_ACCESS_KEY=$PASSWORD'
              sh 'export AWS_DEFAULT_REGION=ap-south-1'
            }
                sh 'ls -lrt'
                sh 'whoami'
                sh '/usr/local/bin/aws s3 ls'
                sh '/usr/local/bin/aws configure list'
            }
        }
    }
}