//Greatest of three numbers
#include<stdio.h>
int greatest(int a,int b,int c) {
    int g;
    if(a>=b) {
        if(a>=c) g=a; else g=c;
    } else {
        if(b>=c) g=b; else g=c;
    }
    return g;
}
void main(){ int a,b,c; scanf("%d %d %d",&a,&b,&c); printf("%d", greatest(a,b,c)); }
