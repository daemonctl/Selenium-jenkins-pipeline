pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn --version'
                dir ('ToolsQa'){
                    sh 'ls '
                    sh 'pwd'
                    sh 'mvn clean'
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
               	sh 'mvn test -Dtest=ToolsQaTest tests'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}