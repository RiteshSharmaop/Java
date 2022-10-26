#include<iostream>
using namespace std;

void init_code() {
// fast_io;
#ifndef ONLINE_JUDGE

freopen("input1.txt", "r", stdin);
freopen("output1.txt", "w", stdout);

#endif // ONLINE_JUDGE 
}

char solve(int an ,int  bn , string a , string b , char aa , char bb){
    if(a==b) return '=';
    if(aa == 'S' && bb != 'S') return '<';
    else if(aa == 'L' && bb !='L' ) return '>';
    else if(aa == bb){
        if(aa == 'S'){
            if(a == b) return '=';
            int counta = 0; 
            for(int i = 0 ; i < an-1 ; i++){
                if(a[i] == 'X') counta++;
            }
            int countb = 0;
            for(int i = 0 ; i < bn-1 ; i++){
                if(b[i] == 'X') countb++;
            } 
            if(counta == countb ) return '=';
            else if( counta > countb) return '<';
            else return '>';  
        }else {
            if(a == b) return '=';
            int counta = 0; 
            for(int i = 0 ; i < an-1 ; i++){
                if(a[i] == 'X') counta++;
            }
            int countb = 0;
            for(int i = 0 ; i < bn-1 ; i++){
                if(b[i] == 'X') countb++;
            } 
            if(counta == countb ) return '=';
            else if( counta > countb) return '>';
            else return '<';  
        }
    }else if(aa = 'M'){
        if(bb == 'L')return '<';
        else return '>';
    }
}

int main() {
    init_code();
    int t;
    cin>>t;
    while(t--){
        string a , b;
        cin>>a>>b;
        int an = a.length();
        int bn  = b.length();
        char aa = a[an-1];
        char bb = b[bn-1];
        cout<<solve(an ,bn , a , b , aa , bb)<<endl;
    }

    return 0;
}