//Print perfect numbers in range 1..n
#include<stdio.h>
int print_perfects() {
    int n = 1000, i,j;
    for(i=2;i<=n;i++){
        int sum=1;
        if(i==1) sum=0;
        for(j=2;j*j<=i;j++){
            if(i%j==0){ sum+=j; if(j!=i/j) sum+=i/j; }
        }
        if(sum==i) { printf("%d", i); if(i<n) printf(" "); }
    }
    return 0;
}
void main(){ print_perfects(); }
