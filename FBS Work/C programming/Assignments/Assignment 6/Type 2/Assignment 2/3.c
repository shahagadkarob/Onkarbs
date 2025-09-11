//Greatest of three numbers
#include<stdio.h>
int greatest() {
    int a=5,b=9,c=3;
    int g;
    if(a>=b) {
        if(a>=c) g=a; else g=c;
    } else {
        if(b>=c) g=b; else g=c;
    }
    return g;
}
void main(){ printf("%d", greatest()); }
