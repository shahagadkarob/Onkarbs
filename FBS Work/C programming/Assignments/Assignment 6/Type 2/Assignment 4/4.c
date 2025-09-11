//Print strong numbers in range 1..n
#include<stdio.h>
int print_strong() {
    int n = 500, i;
    for(i=1;i<=n;i++){
        int tmp=i,sum=0,d;
        while(tmp){ d=tmp%10; int f=1,k; for(k=1;k<=d;k++) f*=k; sum+=f; tmp/=10; }
        if(sum==i) { printf("%d", i); if(i<n) printf(" "); }
    }
    return 0;
}
void main(){ print_strong(); }
