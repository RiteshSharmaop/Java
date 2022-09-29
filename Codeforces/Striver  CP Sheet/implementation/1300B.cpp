#include<bits/stdc++.h>
using namespace std;
int main() {
    int t;
    cin>>t;
    while(t--){;
        int n;
        cin>>n;
        int nn = n;
        n *= 2;
        int arr[n];
        for(int i = 0 ; i < n ; i++){
            cin>>arr[i];
        }
        if(nn == 1){
            if(arr[0]>arr[1]){
                cout<<arr[0]-arr[1]<<endl;
            }else{
                cout<<arr[1]-arr[0]<<endl;
            }
        }else{
            sort(arr ,arr+n); 
            cout<<arr[nn] - arr[nn-1]<<endl;
        }   
        
        
        
    }
    return 0;
}