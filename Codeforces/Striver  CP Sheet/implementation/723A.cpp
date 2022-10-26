#include<bits/stdc++.h>
using namespace std;
int main() {
    int a,b,c;
    cin>>a>>b>>c;
    vector<int> v = { a,b,c};
    int maxi = *max_element(v.begin(), v.end());
    int mini = *min_element(v.begin(), v.end());
    int maini  = INT32_MAX; 
    for(int i = mini ; i <= maxi ; i++ ){
        int sum = 0;
        sum = max(a,i) - min(a,i);
        sum += max(b,i) - min(b,i);
        sum += max(c,i) - min(c,i);
        maini = min(sum,maini);
    }
    cout<<maini;
    return 0;
}