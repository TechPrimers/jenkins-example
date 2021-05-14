pipeline {
	agent {  label 'linux-node-ec2' }
	stages {
		stage('---clean---'){
			tools {
				maven 'Maven3.5.0'
			}
			steps {
				
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
