#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t!=0){
	    int a,b,c;
	    cin>>a>>b>>c;
	    if(a>b+c || b>a+c || c>a+b){
	        cout<<"YES"<<endl;
	    }else{
	        cout<<"NO"<<endl;
	    }
	    t--;
	}
	return 0;
}
