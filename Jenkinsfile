/* groovylint-disable-next-line CompileStatic */
pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME'
    }

        stages {
            stage('Welcome Stage') {
                steps {
                echo 'welcome'
                }
            }
            stage('Clean Stage')
            {
                steps {
                sh 'mvn clean'
                }
            }
            stage('Test Stage') {
                steps {
                sh 'mvn test'
                }
            }
            stage('Build Stage') {
                steps {
                sh 'mvn build'
                }
            }
        }
}
