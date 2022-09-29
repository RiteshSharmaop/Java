#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    int n ; cin>>n;
	    int arr[n];
	    for(int i = 0 ; i < n ; i++){
	        cin>>arr[i];
	    }
	    sort(arr,arr+n);
	    int maxi = 1000000000;
        int mini = 0;
	    for(int i = 0 ; i<n-1 ; i++){
	        mini = arr[i+1] -arr[i];
	        if(maxi> mini) {
	            maxi = mini;
	        }
	    }
	    cout<<maxi<<endl;
	}
	return 0;
}
