//Print Armstrong numbers in range 1..n
#include<stdio.h>
int print_arm() {
    int n = 500, num;
    for(num=1; num<=n; num++) {
        int tmp=num, sum=0, digits=0, t=tmp;
        while(t){ digits++; t/=10; }
        tmp = num;
        while(tmp){ int d = tmp%10; int p=1, i; for(i=0;i<digits;i++) p*=d; sum+=p; tmp/=10; }
        if(sum==num) { printf("%d", num); if(num<n) printf(" "); }
    }
    return 0;
}
void main(){ print_arm(); }
