#include<bits/stdc++.h>
using namespace std;

void init_code() {
// fast_io;
#ifndef ONLINE_JUDGE

freopen("input1.txt", "r", stdin);
freopen("output1.txt", "w", stdout);

#endif // ONLINE_JUDGE 
}

int main() {
    init_code();
    int t;
    cin>>t;

    while(t--){
        string s ;
        cin>>s;
        int n = s.length();
        if(n > 10) cout<<s[0] << n-2 << s[n-1]<<endl;
        else {
            cout<< s <<endl;
        }
    }
    return 0;
}