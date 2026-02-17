def testing() {
    echo 'testing the application... through script'
}

def buildImage() {
    echo "building the docker image... through script"
    sh 'podman-remote build  --build-arg HTTP_PROXY=$HTTP_PROXY --build-arg HTTPS_PROXY=$HTTPS_PROXY --build-arg HTTP_PROXY=$NO_PROXY -t myapp:1.0.0 .'
}

def deployApp() {
    echo 'deploying the application... through script'
    sh 'podman-remote run -d -p 8701:8701 --name myapp myapp:1.0.1'
}

return this
