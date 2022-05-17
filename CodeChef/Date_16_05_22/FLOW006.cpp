
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t ;
    cin>>t;
    while(t!=0){
        int n,count;
        cin>>n;
        count =0;
        while(n!=0){
            count=n%10+count;
            n = n/10;
        }
        cout<<count<<endl;;
        t--;
    }

    return 0;
}
