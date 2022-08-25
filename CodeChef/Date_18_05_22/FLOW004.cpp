
#include<bits/stdc++.h>

using namespace std;
#define el endl;

int main()
{
    int t;
    cin>>t;
    while(t!=0){
        int n, e,s;
        cin>>n;
        s = 0;
        e = n%10;
        if(n>=100000){
            s = n/100000;
        }else if(n>=10000 && n<100000){
            s = n/10000;
        }else if(n>=1000 && n<10000){
            s = n/1000;
        }else if(n>=100 && n<1000){
            s= n/100;
        }else if(n>=10 && n<100){
            s = n/10;
        }
        
        cout<<s+e<< endl;
        t--;
    }
  return 0;

}


