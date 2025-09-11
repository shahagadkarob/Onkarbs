//Area of triangle
#include<stdio.h>
float tri_area(int b,int h) {
    return (b*h)/2.0;
}
void main() {
    int b,h;
    scanf("%d %d",&b,&h);
    printf("%.2f",tri_area(b,h));
}
