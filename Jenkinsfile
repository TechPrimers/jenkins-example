pipeline {
	agent {  label 'wind-node' }
	stages {
		stage('---clean---'){
			steps {
				tool name: 'Maven3.5.0', type: 'maven'
				sh "mvn clean"
			}
		}
		stage('---test---') {
			steps {
				
				sh "mvn test"
			}
		}
		stage('---package---'){
			steps {
				
				sh "mvn package"
			}
		}
	}
}
