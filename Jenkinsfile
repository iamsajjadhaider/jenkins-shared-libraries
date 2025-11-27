@Library("Shared") _
pipeline {
    agent any

    stages {
        stage('Step 1') {
            steps {
                script {
                    hello-world ("Dil Dil Pakistan Hello World")

                }
            }
        }
        
        stage('Step 2') {
            steps {
                     script {hello()}
            }
        }
        
        stage('Step 3') {
            steps {
                     script {hello()}
            }
        }
        
        stage('Step 4') {
            steps {

                     script {hello()}
                     script {clone("https://github.com/iamsajjadhaider/jenkins-shared-libraries.git", "main")}
            }
        }
    }
}
