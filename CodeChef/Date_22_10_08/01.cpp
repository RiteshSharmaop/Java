#include<bits/stdc++.h>
using namespace std;
bool solve(int four , int n){
    if(four== n || n == 1) return true;
    if(four > n ) return false;
    return solve(four*4 , n);
}
bool isPowerOfFour(int n) {
    int four = 4; 
    return solve(four , n);
}
int main(){
    int n;
    cin>>n;
    if(isPowerOfFour(n))cout<<"Yes"<<endl;
    else cout<<"NO"<<endl;
    return 0;
}