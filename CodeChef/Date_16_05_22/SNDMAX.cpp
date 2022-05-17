#include <iostream>
using namespace std;

int main() {
	int n;
	cin>>n;
    while(n!=0){
        int a,b,c;
        cin>>a;
        cin>>b;
        cin>>c;
        if(a>b && a<c || a>c && a<b){
            cout<<a<<endl;
        }else if(b>a && b<c || b>c && b<a){
            cout<<b<<endl;
        }else{
            cout<<c<<endl;
        }
        n--;
    }
	return 0;
}
