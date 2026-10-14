pipeline {
    agent any

    tools {
        // Tells Jenkins to use the Maven tool configured in:
        // Manage Jenkins -> Tools -> Maven installations -> Name: Maven3
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code from Git...'
                checkout scm
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java source files with Maven...'
                script {
                    if (isUnix()) {
                        sh 'mvn clean compile'
                    } else {
                        bat 'mvn clean compile'
                    }
                }
            }
        }

        stage('Run Tests') {
            steps {
                echo 'Executing JUnit 5 test cases...'
                script {
                    if (isUnix()) {
                        sh 'mvn test'
                    } else {
                        bat 'mvn test'
                    }
                }
            }
            post {
                always {
                    junit testResults: '**/target/surefire-reports/*.xml', allowEmptyResults: true
                }
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging application into JAR...'
                script {
                    if (isUnix()) {
                        sh 'mvn package -DskipTests'
                    } else {
                        bat 'mvn package -DskipTests'
                    }
                }
            }
            post {
                success {
                    archiveArtifacts artifacts: 'target/*.jar', fingerprint: true, allowEmptyArchive: true
                }
            }
        }
    }

    post {
        success {
            echo '=================================================='
            echo 'Jenkins Pipeline build and test completed successfully!'
            echo '=================================================='
        }
        failure {
            echo '=================================================='
            echo 'Pipeline failed. Check stage logs for details.'
            echo '=================================================='
        }
    }
}
