pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './mvnw verify'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }
    }
}



