#include<bits/stdc++.h>
using namespace std;
bool solve(string str, int n){
    for(int i = 0 ; i < n ; i++){
            int op = 4;
            int k = i+4;
            for(int j = i ; j < k ; j++){
                if(str[j] != 'a' || str[j] != 'e'||str[j] != 'i'||str[j] != 'o'||str[j] != 'u'){
                    op--;
                }
                if(op == 0){
                    return false;
                }
            }
        }
        return true;
}
int main() {
    int t;
    cin>>t;
    while(t--){;
        string str;
        cin>>str;
        int n = str.length();
        
        
        cout<<solve(str,n)<<endl;
        
    }
    return 0;
}