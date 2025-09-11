//Strong number check
#include<stdio.h>
int is_strong() {
    int n=145,tmp=n,sum=0,d,i;
    while(tmp) {
        d=tmp%10; int f=1;
        for(i=1;i<=d;i++) f*=i;
        sum+=f; tmp/=10;
    }
    return sum==n;
}
void main(){ if(is_strong()) printf("Strong"); else printf("Not Strong"); }
