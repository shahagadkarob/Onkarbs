//Addition of two numbers
#include<stdio.h>
int add(int a,int b) {
    return a + b;
}
void main() {
    int a,b;
    scanf("%d %d",&a,&b);
    int res = add(a,b);
    printf("sum is %d.",res);
}
