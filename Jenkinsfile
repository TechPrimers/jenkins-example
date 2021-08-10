pipeline {
	agent {  label 'linux-ec2-node' }
	stages {
		stage('---clean---'){
			tools {
				maven 'maven 3.8.1'
			}
			steps {
				
				sh "mvn clean"
			}
		}
		stage('---test---') {
			tools {
				maven 'maven 3.8.1'
			}
			steps {
				
				sh "mvn test"
			}
		}
		stage('---package---'){
			tools {
				maven 'maven 3.8.1'
			}
			steps {
				
				sh "mvn package"
			}
		}
	}
	post {
		success {
			echo 'job was built successfully'
		}
		failure {
			echo 'job was not build..it was failed'
		}
	}
}
