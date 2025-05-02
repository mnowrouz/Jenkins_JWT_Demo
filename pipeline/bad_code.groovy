pipeline {
    agent any

    stages {
        stage('Top Secret Login') {
            steps {
                script {
                    // Super confidential credentials – do NOT share (unless it's in a Jenkins log)
                    def username = "admin"
                    def password = "Cyberark1" // nothing says "secure" like hardcoding secrets

                    // Printing sensitive info directly to the logs because we trust everyone here
                    echo """
        _  
     __|_|__                
      (•_•)         
     <)   )╯    
     /   \\     Never Hardcode secrets...
     
     
     ...without me ;)
"""

                    echo "Logging in as '${username}' with password: '${password}' 🔓"
                    
                    
                    if (password == "Cyberark1") {
                        echo "Access granted. Welcome to the vault 👑 lol"
                    } else {
                        echo "Incorrect password. Did you mean 'admin123'?"
                    }
                }
            }
        }
    }
}
