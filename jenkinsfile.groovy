pipeline {
    agent any

    environment {
        KATALON_API_KEY = credentials('KATALON_API_KEY')  // Use the Jenkins credential ID for the Katalon TestOps API Key
        GIT_REPO_URL = 'https://github.com/yourusername/your-katalon-project'  // Replace with your GitHub repo URL
        PROJECT_PATH = './your-katalon-project/your_project.prj'  // Path to the Katalon project
        TEST_SUITE_PATH = 'Test Suites/YourMobileTestSuite'  // Test Suite path in Katalon
        KATALON_TESTOPS_SERVER_URL = 'https://analytics.katalon.com'
        DEVICE_ID = 'your_device_id'  // Replace with the device ID for Android or iOS
        APP_PATH = '/path/to/your/app.apk'  // Path to your APK/IPA file if needed
    }

    stages {
        stage('Checkout Code') {
            steps {
                echo "Cloning Katalon project from GitHub"
                git url: "$GIT_REPO_URL", branch: 'main'  // Replace 'main' with your branch if different
            }
        }

        stage('Setup') {
            steps {
                echo "Setting up dependencies"
                // Install dependencies such as adb or any additional tools
                sh 'sudo apt-get update'
                sh 'sudo apt-get install -y adb'
                
                echo "Starting Appium server"
                sh 'appium &'
            }
        }

        stage('Run Katalon Mobile Tests') {
            steps {
                echo "Executing Katalon Studio mobile tests"
                sh """
                katalonc -noSplash -runMode=console -projectPath="$PROJECT_PATH" \
                -retry=0 -testSuitePath="$TEST_SUITE_PATH" \
                -browserType="Android" -deviceId="$DEVICE_ID" -apiKey="$KATALON_API_KEY" \
                -testOpsServerUrl="$KATALON_TESTOPS_SERVER_URL" \
                -uploadTestResult=true
                """
            }
        }

        stage('Upload Results to TestOps') {
            steps {
                echo "Uploading test results to Katalon TestOps"
                sh """
                katalonc -noSplash -runMode=console -projectPath="$PROJECT_PATH" \
                -retry=0 -testSuitePath="$TEST_SUITE_PATH" \
                -browserType="Android" -deviceId="$DEVICE_ID" -apiKey="$KATALON_API_KEY" \
                -testOpsServerUrl="$KATALON_TESTOPS_SERVER_URL" \
                -uploadTestResult=true
                """
            }
        }
    }

    post {
        always {
            echo "Cleaning up resources"
            // Stop the Appium server if needed
            sh 'killall node || true'
        }
        success {
            echo "Tests completed successfully and results uploaded to TestOps"
        }
        failure {
            echo "Tests failed or there was an issue uploading to TestOps"
        }
    }
}
