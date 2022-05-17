#include<iostream>
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t!=0){
        int a,b;
        cin>>a>>b;
        if(b<a){
            cout<<a%b<<endl;
        }else{
            cout<<a<<endl;
        }
        t--;
    }
    return 0;
}

