//Print perfect numbers in range 1..n
#include<stdio.h>
void print_perfects(int n) {
    int i,j;
    for(i=2;i<=n;i++){
        int sum=1;
        if(i==1) sum=0;
        for(j=2;j*j<=i;j++){
            if(i%j==0){ sum+=j; if(j!=i/j) sum+=i/j; }
        }
        if(sum==i) { printf("%d", i); if(i<n) printf(" "); }
    }
}
void main(){ int n; scanf("%d",&n); print_perfects(n); }
