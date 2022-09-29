#include<bits/stdc++.h>
using namespace std;
int main() {
    int t;
    cin>>t;
    string arr[t];
    int count = 0;
    for(int i = 0 ; i < t ; i++){
        cin>>arr[i];
        if(arr[i]=="Icosahedron"){
            count +=20;
        }else if(arr[i]=="Cube"){
            count += 6;
        }else if(arr[i]=="Octahedron"){
            count += 8;
        }else if(arr[i]=="Dodecahedron"){
            count += 12;
        }else{
            count += 4;
        }
    }
    cout<<count<<endl;
    
    return 0;
}