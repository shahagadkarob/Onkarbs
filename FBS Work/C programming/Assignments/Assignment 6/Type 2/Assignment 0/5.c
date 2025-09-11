//Average of five numbers
#include<stdio.h>
float avg5() {
    int a=1,b=2,c=3,d=4,e=5;
    return (a+b+c+d+e)/5.0;
}
void main() {
    float av = avg5();
    printf("average is %.2f.",av);
}
