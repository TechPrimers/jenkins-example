pipeline {
	agent {  label 'ec2-linux-node' }
	stages {
		stage('---clean---'){
			tools {
				maven 'Maven 3.5.4'
			}
			steps {
				
				sh "mvn clean"
			}
		}
		stage('---test---') {
			tools {
				maven 'Maven 3.5.4'
			}
			steps {
				
				sh "mvn test"
			}
		}
		stage('---package---'){
			tools {
				maven 'Maven 3.5.4'
			}
			steps {
				
				sh "mvn package"
			}
		}
	}
	post {
		always {
			echo 'job was built successfully'
		}
	}
}
