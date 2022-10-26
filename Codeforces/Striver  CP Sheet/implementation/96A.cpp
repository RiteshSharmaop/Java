#include<bits/stdc++.h>
using namespace std;
bool solve(int k){
    if(k<=0){
        return true;
    }else false;
}
int main() {
    int t;
    cin>>t;
    while(t--){;
        string s;
        cin>>s;
        int n = s.length();
        int k = 7;
        for(int i = 0 ; i<= n-k ; i++ ){
            for(int j = i ; j <= 7 ; j++){
                if(s[j] == s[j+1]){
                    k--;
                }
            }
        }
        
        if(solve(k)){
            cout<<"YES"<<endl;
        }else {
            cout<<"NO"<<endl;
        }
        
    }
    return 0;
}