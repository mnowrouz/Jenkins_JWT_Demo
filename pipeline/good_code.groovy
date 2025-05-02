pipeline {
    agent any

    stages {
        stage('Top Secret Login') {
            steps {
                script {
                    withCredentials([
                        conjurSecretCredential(credentialsId: 'Vault-app1-Jenkins_Demo_Automation-Operating System-AutomationUser-admin-username', variable: 'USERNAME'),
                        conjurSecretCredential(credentialsId: 'Vault-app1-Jenkins_Demo_Automation-Operating System-AutomationUser-admin-password', variable: 'PASSWORD')
                    ]) {

                        def username = USERNAME
                        def password = PASSWORD

                        echo """
        _  
     __|_|__                
      (•_•)         
     <)   )╯    
     /   \\     Never hardcode secrets...
     
     
     ...forreal tho ;(
"""

                        echo "Logging in as '${username}' with password: '${password}'"

                        if (password == "Cyberark1") {               // Keeping this here to prove the masked secret = Cyberark1
                            echo "Access granted. Welcome to the vault 👑 lol"
                        } else {
                            echo "Incorrect password. Did you mean 'admin123'?"
                        }
                    }
                }
            }
        }
    }
}
