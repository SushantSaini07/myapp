def testing() {
    echo 'testing the application... through script'
}

def buildImage() {
    echo "building the docker image... through script"
    sh 'podman-remote build  --build-arg HTTP_PROXY=$HTTP_PROXY --build-arg HTTPS_PROXY=$HTTPS_PROXY --build-arg HTTP_PROXY=$NO_PROXY -t myapp:1.0.1 .'
}

def deployApp(branch_name) {
    echo 'deploying the application... through script'
    def safeBranch = branch_name.replaceAll('/', '-')
    sh "podman-remote run -d -p 8701:8701 --name myapp-${safeBranch} myapp:1.0.1"
    echo 'removing container'
    sh "podman-remote rm -rf myapp-${safeBranch}"
    echo "container removed"
}

return this
