//Factorial
#include<stdio.h>
long long fact(int n) {
    int i; long long f=1;
    for(i=1;i<=n;i++) f*=i;
    return f;
}
void main(){ int n; scanf("%d",&n); printf("%lld", fact(n)); }
