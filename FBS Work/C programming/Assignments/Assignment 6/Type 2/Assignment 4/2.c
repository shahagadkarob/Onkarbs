//Print primes in range 1..n
#include<stdio.h>
int print_primes() {
    int n = 50, i,j;
    for(i=2;i<=n;i++){
        int p=1;
        for(j=2;j*j<=i;j++) if(i%j==0){ p=0; break; }
        if(p) { printf("%d", i); if(i<n) printf(" "); }
    }
    return 0;
}
void main(){ print_primes(); }
