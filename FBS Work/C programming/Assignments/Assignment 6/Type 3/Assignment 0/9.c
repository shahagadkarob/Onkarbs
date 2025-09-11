//Area of triangle
#include<stdio.h>
void tri_area(int b,int h) {
    float area = (b*h)/2.0;
    printf("%.2f",area);
}
void main() {
    int b,h;
    scanf("%d %d",&b,&h);
    tri_area(b,h);
}
