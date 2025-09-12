//Strong number check
#include<stdio.h>
void is_strong(int *n) {
    int tmp=*n,sum=0,d,i;
    while(tmp) {
        d=tmp%10; int f=1;
        for(i=1;i<=d;i++) f*=i;
        sum+=f; tmp/=10;
    }
    if(sum==*n) 
    printf("Strong"); 
    else 
    printf("Not Strong");
}
void main(){ 
    int n; 
    printf("Enter a number: ");
    scanf("%d",&n); 
    is_strong(&n); }
