def clone(String repoUrl,String branchName) {
    git url : "${repoUrl}", branch: "${branchName}"
}