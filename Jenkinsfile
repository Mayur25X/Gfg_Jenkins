/* groovylint-disable-next-line CompileStatic */
pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME'
    }

        stages {
            stage('Welcome Stage') {
            echo 'welcome'
            }
            stage('Clean Stage')
            {
                sh 'mvn clean'
            }
            stage('Test Stage') {
                sh 'mvn test'
            }
            stage('Build Stage') {
                sh 'mvn build'
            }
        }
}

