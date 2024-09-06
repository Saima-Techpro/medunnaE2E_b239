pipeline {
    agent any 
    tools {
        mvn 'Maven 3.9.9' 
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
