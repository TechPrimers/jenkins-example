pipeline {
	agent {  label 'linux-node' }
	stages {
		stage('---clean---'){
			tools {
				maven 'maven3.5.4'
			}
			steps {
				
				sh "mvn clean"
			}
		}
		stage('---test---') {
			tools {
				maven 'maven3.5.4'
			}
			steps {
				
				sh "mvn test"
			}
		}
		stage('---package---'){
			tools {
				maven 'maven3.5.4'
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
