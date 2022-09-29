#include<bits/stdc++.h>
using namespace std;
bool solve(int arr[] , int n){
    for(int i = 0 ; i < n ; i++){
        cin>>arr[i];
        if(arr[i]==1) return false;
    }
        return true;
}
int main() {
    
    int n;
    cin>>n;
    int arr[n];
    
    if(solve(arr,n)) cout<<"EASY"<<endl;
    else cout<<"HARD"<<endl;
    
    
    
    return 0;
}