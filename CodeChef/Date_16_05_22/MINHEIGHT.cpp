#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t!=0){
	    int a,b;
	    cin>>a>>b;
	    if(a>=b){
	        cout<<"YES"<<endl;
	    }else
	        cout<<"NO"<<endl;
	    t--;
	}
	return 0;
}
s