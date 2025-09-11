//Armstrong check
#include<stdio.h>
int is_arm(int n) {
    int tmp=n,sum=0,d;
    while(tmp){ d=tmp%10; sum+=d*d*d; tmp/=10; }
    return sum==n;
}
void main(){ int n; scanf("%d",&n); if(is_arm(n)) printf("Armstrong"); else printf("Not Armstrong"); }
