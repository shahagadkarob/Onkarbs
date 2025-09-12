//Sum of first and last digit
#include<stdio.h>
void sum_fl(int *n) {
    int last = *n%10;
    int first = *n;
    while(first>=10) first/=10;
    printf("%d",(first+last));
}
void main(){ 
    int n; 
    printf("Enter a number: ");
    scanf("%d",&n); 
    sum_fl(&n); }
