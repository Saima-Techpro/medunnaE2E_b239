// pipeline {
//     agent any
//     stages {
//         stage('Build') {
//             steps {
//                 sh './mvnw test'
//             }
//         }
//         stage('Test') {
//             steps {
//                 sh './mvnw test'
//             }
//         }
//         stage('Deploy') {
//             steps {
//                 sh './mvnw test'
//             }
//         }
//     }
// }


pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                sh 'make'
            }
        }
        stage('Test'){
            steps {
                sh 'make check'
                junit 'reports/**/*.xml'
            }
        }
        stage('Deploy') {
            steps {
                sh 'make publish'
            }
        }
    }
}
