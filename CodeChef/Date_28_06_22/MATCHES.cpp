#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin >> t;
	while(t--){
	    int a , b;
	    cin>> a >> b;
	    int sum = a+b;
	    int ab = 0;
	    int arr[10] = {6,2,5,5,4,5,6,3,7,6};
	    while(sum>0){
	        int rem = sum %10;
	        ab = ab + arr[rem];
	        sum = sum/10;
	        
	    }
	    cout << ab<<endl;
	}
	return 0;
}
