def gitDownload(repo)
{
   git "https://github.com/ANYA-123/${repo}.git"
}

def mavenBuild()
{
    sh 'mvn package'
}

def deployTomcat(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}

def runSelenium(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}


