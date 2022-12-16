pipeline {
	agent {  label 'linux-node' }
	stages {
		stage('---clean----'){
			tools {
				maven 'maven_3.8.6'
			}
			steps {
				sh "mvn clean"
			}
		}
		stage('---test---') {
			tools {
				maven 'maven_3.8.4'
			}
			steps {
				sh "mvn test"
			}
		}
		stage('---package---'){
			tools {
				maven 'maven_3.8.1'
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
