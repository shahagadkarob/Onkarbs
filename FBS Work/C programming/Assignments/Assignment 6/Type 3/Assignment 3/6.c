//Perfect number check
#include<stdio.h>
void is_perfect(int n) {
    int i,sum=1;
    if(n==1) sum=0;
    for(i=2;i*i<=n;i++) {
        if(n%i==0) { sum+=i; if(i!=n/i) sum+=n/i; }
    }
    if(sum==n) printf("Perfect"); else printf("Not Perfect");
}
void main(){ int n; scanf("%d",&n); is_perfect(n); }
