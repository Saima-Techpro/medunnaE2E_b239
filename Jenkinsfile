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
        // stage('List Reports') {  // use this if you need to see the list of directory of all folders 
        //     steps {
        //         sh 'ls -R target'  // List files to verify report generation
        //     }
        // }
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
                // attachmentsPattern: '**/target/surefire-reports/*',  // Path to your reports (e.g., JUnit XML reports)
                attachmentsPattern: '''target/cucumber-reports.html, 
                                      target/cucumber-html-reports/*.html'''  // Include HTML reports
                
            )
        }
    }
}


