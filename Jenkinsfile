@Library('jenkins-shared-library') _
import org.example.Utils

pipeline {
    agent any

    stages {
        stage('Test Shared Library') {
            steps {
                script {
                    // Call global function
                    sayHelloWorld()

                    // Call class method
                    def util = new Utils(this)
                    util.sayHelloJenkins()
                }
            }
        }
    }
}
