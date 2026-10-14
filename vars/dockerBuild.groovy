def build(String imgName){
    sh "docker build -t ${imgName} ."
}