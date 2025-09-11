//Prime check
#include<stdio.h>
int is_prime() {
    int n = 7, i;
    if(n<=1) return 0;
    for(i=2;i*i<=n;i++) if(n%i==0) return 0;
    return 1;
}
void main(){ if(is_prime()) printf("Prime"); else printf("Not Prime"); }
