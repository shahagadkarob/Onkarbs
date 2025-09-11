//Area of triangle
#include<stdio.h>
float tri_area() {
    int b=5,h=4;
    return (b*h)/2.0;
}
void main() {
    printf("area is %.2f.",tri_area());
}
