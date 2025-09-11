//Sum of numbers in range
#include<stdio.h>
void sum_range(int s,int e) {
    int i,sum=0;
    for(i=s;i<=e;i++) sum+=i;
    printf("%d",sum);
}
void main(){ int s,e; scanf("%d %d",&s,&e); sum_range(s,e); }
