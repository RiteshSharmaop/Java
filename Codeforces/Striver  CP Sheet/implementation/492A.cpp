#include<bits/stdc++.h>
using namespace std;
int solve(int n , int sum , int row){
    int tot = 0;
    int  i = 1;
    while(tot < n){
        sum += i;
        tot += sum;
        if(tot <= n) row++;
        i++; 
    }
    return row;
        
}
int main() {
    int t;
    cin>>t;
    while(t--){;
        int n;
        cin>>n;
        int sum = 0;
        int row = 0;
        
        cout<<solve(n,sum,row)<<endl;;  
        
    }
    return 0;
}