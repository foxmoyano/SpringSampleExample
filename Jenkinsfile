pipeline {
    environment {
        JAVA_TOOL_OPTIONS = "-Duser.home=/var/jenkins_home"
    }

    agent {
        docker {
            image "maven:3.6.0-jdk-13"
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