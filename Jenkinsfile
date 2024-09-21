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
    post {
        always {
            // This block will always execute at the end of the pipeline
            emailext(
                subject: "Jenkins Build - ${currentBuild.fullDisplayName}",
                body: """<p>Build: ${currentBuild.fullDisplayName} (${env.BUILD_URL})</p>
                         <p>Status: ${currentBuild.currentResult}</p>""",
                to: 'saima.techproed@gmail.com', // Recipient
                from: 'saima.techproed@gmail.com', // Your email
                replyTo: 'saima.techproed@gmail.com', // Reply-to email
                 attachLog: true,  // Attach the console log
                attachments: '**/target/surefire-reports/*.xml'  // Path to your reports (e.g., JUnit XML reports)
                
            )
        }
    }
}


