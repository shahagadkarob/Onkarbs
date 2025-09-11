//Print primes in range 1..n
#include<stdio.h>
void print_primes(int n) {
    int i,j;
    for(i=2;i<=n;i++){
        int p=1;
        for(j=2;j*j<=i;j++) if(i%j==0){ p=0; break; }
        if(p) { printf("%d", i); if(i<n) printf(" "); }
    }
}
void main(){ int n; scanf("%d",&n); print_primes(n); }
