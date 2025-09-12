//Area of circle
#include<stdio.h>
void area_circle(int*r) {
    float area = 3.14 *(*r) *(*r);
    printf("area of circle with radius %d is %.2f.",*r,area);
}
void main() {
    int r;
    printf("Enter the radius of circle:");
    scanf("%d",&r);
    area_circle(&r);
}
