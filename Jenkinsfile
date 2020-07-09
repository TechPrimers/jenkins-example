pipeline {
    agent any
 triggers {
        githubPush()
    }
    tools {
        maven 'Maven' 
    }

    stages {
        stage ('Compile Stage1') {

            steps {
                
                    sh 'mvn clean compile'
                
            }
        }

        stage ('Testing Stage') {

            steps {
               
                    sh 'mvn test'
                
            }
        }


        stage ('Deployment Stage') {
            steps {
                
                    println('deploying')
                
            }
        }
    }
}
