//Armstrong check
#include<stdio.h>
int is_arm() {
    int n=153,tmp=n,sum=0,d;
    while(tmp){ d=tmp%10; sum+=d*d*d; tmp/=10; }
    return sum==n;
}
void main(){ if(is_arm()) printf("Armstrong"); else printf("Not Armstrong"); }
