pipeline{
    stages{
        stage('Build'){
            sh "mvn clean package -Dtest=ToolsQaTest test"
        }

        stage('Test'){
            echo 'Testing...'
        }

        stage('Deploy'){
            echo 'Deploying...'
        }
    }
}