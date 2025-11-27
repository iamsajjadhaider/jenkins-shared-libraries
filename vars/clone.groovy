def call(String url, String branch) {
    echo "Clone Branch Procedure Initiated for URL: ${url} and Branch: ${branch}"
    
    // Using a script step is often required inside a library's call method
    // when using pipeline steps like 'git', though sometimes it's optional.
    // It's a good practice to include it for reliability.
    script {
        // The 'git' step uses named arguments 'url:' and 'branch:'.
        // The double quotes allow for Groovy string interpolation.
        git url: "${url}", branch: "${branch}"
    }

    echo "Clone Branch Procedure Successfully Completed"
}
