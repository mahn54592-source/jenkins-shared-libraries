def call(String Project, String ImageTag, String dockerUser){
  withCredentials([usernamePassword(credentialsId: "Docker-Hub_Credentials", 
                                   passwordVariable: 'dockerHubPass', 
                                   usernameVariable: 'dockerHubUser')]) {
      sh "docker login -u ${dockerUser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerUser}/${Project}:${ImageTag}"
}
