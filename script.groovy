def buildJar() {
    echo 'building the application... through script'
}

def buildImage() {
    echo "building the docker image... through script"
    sh 'podman build -t myapp:1.0.1 .'
}

def deployApp() {
    echo 'deploying the application... through script'
    sh 'podman run -d -p 8701:8701 --name myapp myapp:1.0.1'
}

return this
