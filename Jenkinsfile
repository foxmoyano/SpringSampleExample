pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11' 
            label 'maven'
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                container('maven') {
                    sh 'echo testing'
                }            
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}