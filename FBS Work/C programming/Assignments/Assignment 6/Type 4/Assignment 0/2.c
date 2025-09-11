//Area of circle
#include<stdio.h>
float area_circle(int r) {
    return 3.14159265 * r * r;
}
void main() {
    int r;
    scanf("%d",&r);
    float a = area_circle(r);
    printf("area is %.2f.",a);
}
