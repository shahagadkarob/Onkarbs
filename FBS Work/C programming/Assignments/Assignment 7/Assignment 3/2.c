//Prime check
#include<stdio.h>
void is_prime(int *n) {
    int i, 
    flag=1;
    if(*n<=1)
    flag=0;
    for(i=2;i*i<=*n;i++) 
        if(*n%i==0){ 
            flag=0; 
            break;
        }
    if(flag) 
    printf("Prime"); 
    else 
    printf("Not Prime");
}
void main(){ 
    int n; 
    printf("Enter Number:");
    scanf("%d",&n); 
    is_prime(&n);
 }
