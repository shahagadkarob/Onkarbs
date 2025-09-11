//Area of circle
#include<stdio.h>
void area_circle(int r) {
    float area = 3.14159265 * r * r;
    printf("area of circle with radius %d is %.2f.",r,area);
}
void main() {
    int r;
    scanf("%d",&r);
    area_circle(r);
}
