def gitDownload(repo)
{
  git "https://github.com/ANYA-123/${repo}.git"
}

def mavenBuild()
{
    sh 'mvn package'
}
