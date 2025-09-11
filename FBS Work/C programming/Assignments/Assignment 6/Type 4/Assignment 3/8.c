//Strong number check
#include<stdio.h>
int is_strong(int n) {
    int tmp=n,sum=0,d,i;
    while(tmp) {
        d=tmp%10; int f=1;
        for(i=1;i<=d;i++) f*=i;
        sum+=f; tmp/=10;
    }
    return sum==n;
}
void main(){ int n; scanf("%d",&n); if(is_strong(n)) printf("Strong"); else printf("Not Strong"); }
