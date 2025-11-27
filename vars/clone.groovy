def call(String url, String branch) {
	echo "Clone Branch Procedure Initiated"
  	git url: "${url}" branch: "${branch}"
 	echo "Clone Branch Procedure Successfully Completed"
}
