//Addition of two numbers
#include<stdio.h>
void add(int*a,int*b) {
    int sum = *a + *b;
    printf("sum of %d and %d is %d.",*a,*b,sum);
}
void main() {
    int a,b;
    printf("Enter the 2 Numbers:");
    scanf("%d %d",&a,&b);
    add(&a,&b);
}
