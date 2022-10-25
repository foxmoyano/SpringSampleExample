pipeline {
    environment {
        JAVA_TOOL_OPTIONS = "-Duser.home=/var/jenkins_home"
    }

    agent {
        docker {
            image "maven:3.6.0-jdk-13"
            args "-v /tmp/maven:/var/jenkins_home/maven/.m2 -e MAVEN_CONFIG=/var/jenkins_home/maven/.m2"
        }
    }

    stages {
        stage("Build") { 
            steps {
                sh "mvn -version"
                sh "pwd"
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