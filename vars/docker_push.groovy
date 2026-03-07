def call(String Project, String ImageTag, String dockerUser){
  withCredentials([usernamePassword(credentialsId: 'docker', 
                                   passwordVariable: 'dockerhubpass', 
                                   usernameVariable: 'dockerhubuser')]) {
      sh "docker login -u ${dockerUser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerUser}/${Project}:${ImageTag}"
}
