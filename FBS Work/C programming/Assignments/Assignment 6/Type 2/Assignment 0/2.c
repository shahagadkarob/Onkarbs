//Area of circle
#include<stdio.h>
float area_circle() {
    int r = 5;
    return 3.14159265 * r * r;
}
void main() {
    float a = area_circle();
    printf("area is %.2f.",a);
}
