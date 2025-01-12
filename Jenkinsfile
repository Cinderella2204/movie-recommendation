pipeline {
    agent any

    environment {
        MAVEN_HOME = '/usr/share/maven'
        JAVA_HOME = '/usr/lib/jvm/java-21-openjdk'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh "${MAVEN_HOME}/bin/mvn clean package -DskipTests"
            }
        }

        stage('Test') {
            steps {
                sh "${MAVEN_HOME}/bin/mvn test"
            }
        }

        stage('Build Docker Image') {
            steps {
                sh "docker build -t movie-recommendation ."
            }
        }

        stage('Deploy') {
            steps {
                sh "docker run -d -p 8080:8080 --name movie-recommendation movie-recommendation"
            }
        }
    }

    post {
        always {
            sh "docker stop movie-recommendation || true"
            sh "docker rm movie-recommendation || true"
        }
    }
}
