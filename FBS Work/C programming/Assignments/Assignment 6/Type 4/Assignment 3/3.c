//Sum of numbers in range
#include<stdio.h>
int sum_range(int s,int e) {
    int i,sum=0;
    for(i=s;i<=e;i++) sum+=i;
    return sum;
}
void main(){ int s,e; scanf("%d %d",&s,&e); printf("%d", sum_range(s,e)); }
