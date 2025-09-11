//Factorial
#include<stdio.h>
void fact(int n) {
    int i; long long f=1;
    for(i=1;i<=n;i++) f*=i;
    printf("%lld",f);
}
void main(){ int n; scanf("%d",&n); fact(n); }
