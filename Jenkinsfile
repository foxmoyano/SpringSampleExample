pipeline {
    agent {
        docker {
            image "maven:3.6.0-jdk-13"
            args "-v /tmp/maven:/$USER/.m2"
        }
    }

    stages {
        stage("Build") { 
            steps {
                sh "mvn -version"
                sh "mvn clean install"
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}