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

        stage ('Deploy?') {

        try {
        input(
                id: 'Proceed1', message: 'Proceed to Production deployment?', parameters: [
                [$class: 'BooleanParameterDefinition', defaultValue: true, description: '', name: 'Please confirm deployment']
                ])
                }
                catch (Exception e) {

                }

        }

        stage ('Deployment Stage') {
            steps {

		            withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'PCF_LOGIN',
                            usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) {

                    sh '/usr/local/bin/cf login -a http://api.run.pivotal.io -u $USERNAME -p $PASSWORD'
			        sh '/usr/local/bin/cf push'

			
                }
            }
        }
    }
}
