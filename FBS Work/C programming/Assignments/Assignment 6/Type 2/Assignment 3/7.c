//Factorial
#include<stdio.h>
long long fact() {
    int n=5,i; long long f=1;
    for(i=1;i<=n;i++) f*=i;
    return f;
}
void main(){ printf("%lld", fact()); }
