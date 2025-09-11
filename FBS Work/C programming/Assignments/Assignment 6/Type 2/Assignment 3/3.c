//Sum of numbers in range
#include<stdio.h>
int sum_range() {
    int s=1,e=5,sum=0,i;
    for(i=s;i<=e;i++) sum+=i;
    return sum;
}
void main(){ printf("%d", sum_range()); }
