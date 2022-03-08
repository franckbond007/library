def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
   sh 'mvn package'
}
def newDeployment(ip,appname)
{
 deploy adapters: [tomcat9(credentialsId: '64325657-48db-4197-a33f-2c10def1ce99', path: '', url: "${ip}")], contextPath: "${appname}", war: '**/*.war'   
} 

def newSelenium(path)
{
 sh 'java -jar "${path}"/testing.jar' 
}





