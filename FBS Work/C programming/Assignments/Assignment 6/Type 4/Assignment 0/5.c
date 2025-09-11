//Average of five numbers
#include<stdio.h>
float avg5(int a,int b,int c,int d,int e) {
    return (a+b+c+d+e)/5.0;
}
void main() {
    int a,b,c,d,e;
    scanf("%d %d %d %d %d",&a,&b,&c,&d,&e);
    float av = avg5(a,b,c,d,e);
    printf("average is %.2f.",av);
}
