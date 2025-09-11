//Total marks and percentage
#include<stdio.h>
float marks() {
    int a=80,b=75,c=90,d=85,e=70;
    int total = a+b+c+d+e;
    printf("%d ",total);
    return total/5.0;
}
void main() {
    float p = marks();
    printf("%.2f",p);
}
