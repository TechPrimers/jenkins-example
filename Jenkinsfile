pipeline {
    agent any

    stages {      
        stage ('Compile Stage') {
            when {
                branch 'master'
            } 
            steps {
                sh '''
                      echo "Hello master branch"
                      echo ${BRANCH_NAME}
                      echo env.BRANCH_NAME
                   '''    
            }
        }
        stage ('Testing Purpose') {
            steps {
                sh '''
                      echo "Second stage execution"
                   '''
            }
        }
    }
    
    stages {

        stage ('Testing Stage') {
             when {
                branch 'develop'
            }

            steps {
                sh '''
                      echo "Hello develop branch"
                   '''    
            }
        }


        stage ('Deployment Stage') {
             when {
                branch 'feature-1'
            }

            steps {
                sh '''
                      echo "Hello feature-1 branch"
                   '''    
            }
        }
    }
}
