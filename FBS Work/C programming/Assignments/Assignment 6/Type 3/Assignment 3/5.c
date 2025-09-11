//Armstrong check
#include<stdio.h>
void is_arm(int n) {
    int tmp=n,sum=0,d;
    while(tmp){ d=tmp%10; sum+=d*d*d; tmp/=10; }
    if(sum==n) printf("Armstrong"); else printf("Not Armstrong");
}
void main(){ int n; scanf("%d",&n); is_arm(n); }
