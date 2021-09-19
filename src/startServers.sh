nohup docker run -p 8090:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home 39f623f7ae09 > &
nohup $JFROG_HOME/artifactory/app/bin/artifactoryctl start > &