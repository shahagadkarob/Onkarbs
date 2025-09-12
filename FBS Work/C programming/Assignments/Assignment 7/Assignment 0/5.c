//Average of five numbers
#include<stdio.h>
void avg5(int *a,int *b,int *c,int *d,int *e) {
    float avg = (*a+*b+*c+*d+*e)/5.0;
    printf("\naverage is %.2f.",avg);
}
void main() {
    int a,b,c,d,e;
    printf("Enter the Five Numbers:");
    scanf("%d %d %d %d %d",&a,&b,&c,&d,&e);
    avg5(&a,&b,&c,&d,&e);
}
