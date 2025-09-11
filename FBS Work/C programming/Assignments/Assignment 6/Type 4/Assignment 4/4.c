//Print strong numbers in range 1..n
#include<stdio.h>
void print_strong(int n) {
    int i;
    for(i=1;i<=n;i++){
        int tmp=i,sum=0,d;
        while(tmp){ d=tmp%10; int f=1,k; for(k=1;k<=d;k++) f*=k; sum+=f; tmp/=10; }
        if(sum==i) { printf("%d", i); if(i<n) printf(" "); }
    }
}
void main(){ int n; scanf("%d",&n); print_strong(n); }
