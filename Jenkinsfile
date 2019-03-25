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


        stage ('Deployment Stage') {
            steps {

		withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'PCF_LOGIN',
usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) {

sh 'cf login -a http://api.run.pivotal.io -u $USERNAME -p $PASSWORD'
 }
            }
        }
    }
}
