// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a,b,count;
    cin>>a>>b;
    count = 0;
    while(a!=0){
        int n;
        cin>>n;
        if(n%b==0){
            count++;
        }
        a--;
    }
    cout<<count<<endl;
    return 0;
}
