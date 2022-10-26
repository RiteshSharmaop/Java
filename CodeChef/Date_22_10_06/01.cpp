#include<bits/stdc++.h>
using namespace std;
int solve ( int n , int m){
    if(n == 1){
        return 0;
    }else if(n == 2){
        return m;
    }else if(n == m){
        return n + m;
    }else {
        return (n-1)*(n)/2;
    }
}
int main() {
    int t;
    cin>>t;
    while(t--){;
        int n , m;
        cin>>n>>m;
        
        cout<<solve(n,m)<<endl;
        
    }
    return 0;
}