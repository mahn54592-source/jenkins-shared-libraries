def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh "docker_build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
