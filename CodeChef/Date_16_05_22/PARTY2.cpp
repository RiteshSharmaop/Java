#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t!=0){
	    int n,x,k;
	    cin>>n>>x>>k;
	    if(n*x<=k)
	        cout<<"YES"<<endl;
	    else
	        cout<<"NO"<<endl;
	    t--;
	}
	return 0;
}
