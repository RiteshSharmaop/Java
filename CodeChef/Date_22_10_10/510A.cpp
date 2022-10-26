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
    int n ,m; 
    cin>>n>>m;
    char prev;
    bool flag = false;
    for(int  i = 1 ; i <= n ; i++){
        for(int j = 1 ; j <= m ; j++){
            bool j1 = false;
            // cout<<"Flag : "<<flag<<endl;
            if(i%2 == 0){
    
                if(prev == '.' && j == m && flag == false && j1 != true ){
                    cout<<'#';
                    flag = true;
                    j1 = false;
                    // cout<<"Flag 2 : "<<flag<<endl;
                }else if(prev == '#' && j == 1 && flag == true ){
                    cout<<'#';
                    flag = false;
                    j1 = true;
                    // cout<<"Flag 3 : "<<flag<<endl;
                }else
                cout<<'.';

                prev = '.';
            }else {
                    char j1 = '#';
                    cout<<'#';
                    prev = '#';
            }
        }
        cout<<endl;
    }
    

    return 0;
}