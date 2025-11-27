def call(String url, String branch) {
    echo "Clone Branch Procedure Initiated for URL: ${url} and Branch: ${branch}"
    
    git url: "${url}", branch: "${branch}"
    
    echo "Clone Branch Procedure Successfully Completed"
}
