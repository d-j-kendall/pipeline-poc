pipeline {
    agent none

    options {

        buildDiscarder logRotator(
                daysToKeepStr: '14',
                numToKeepStr: '3'
        )

        timeout(time: 15, unit: 'MINUTES')
    }

    stages {

        stage("Checkout") {

            steps {
                timeout(time: 15, unit:'MINUTES') {
                    retry(3) {
                        checkout scm
                    }
                }
            }
        }
    }

}