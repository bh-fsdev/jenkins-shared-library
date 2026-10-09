def push(String imageName,
         String tag ,
         String credsId) {

    withCredentials([usernamePassword(
        credentialsId: credsId,
        usernameVariable: 'dockerHubUser',
        passwordVariable: 'dockerHubPass')]) {

        sh """
            echo "\$dockerHubPass" | docker login -u "\$dockerHubUser" --password-stdin
            docker image tag ${imageName} "\$dockerHubUser/${imageName}:${tag}"
            docker push "\$dockerHubUser/${imageName}:${tag}"
        """
    }
}