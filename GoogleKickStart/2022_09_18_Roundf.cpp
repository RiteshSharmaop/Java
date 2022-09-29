#include<bits/stdc++.h>
using namespace std;
int main() {
    int t;
    cin>>t;
    while(t--){;
        int n;
        cin>>n;
        vector<string> color(n);
        vector<int> d(n);
        vector<int> u(n);
        for(int i = 0 ; i < n ; i++){
            cin>>color[i];
            cin>>d[i];
            cin>>u[i];
        }
        vector<vector<string>> arr;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < 3 ; j++){
                if(j == 0){
                    arr[i][j] = color[i];
                }
            }
        }
    
    }
    return 0;
}