#include<bits/stdc++.h>
using namespace std;
bool solve1(int arr[] , vector<int> v , int target){
    for(int i = 0 ; i < 7 - 2; i++){
        for(int j = i+1 ; j < 7  ;i++){
            for(int k = j+1 ; k < 7 ; k++){
                if(arr[i]+arr[j]+arr[k] == target){
                    return true;
                }
            }
        }
    }
    return false;
}
bool solve(int arr[] , int target){
    int sum = 0;
    for(int i = 0 ; i < 7 ; i++){
        for(int j = i+1 ; j < 7-1 ; j++ ){
            
        }
    }
}
int main() {
    int arr[] = {4,5,6,3,9,1,2};
    vector<int> v(3);
    int target = 20;
    cout<<solve1(arr,v,target);
    return 0;
}