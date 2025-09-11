//Perfect number check
#include<stdio.h>
int is_perfect() {
    int n=28,i,sum=1;
    if(n==1) return 0;
    for(i=2;i*i<=n;i++) {
        if(n%i==0) { sum+=i; if(i!=n/i) sum+=n/i; }
    }
    return sum==n;
}
void main(){ if(is_perfect()) printf("Perfect"); else printf("Not Perfect"); }
