//Celsius to Fahrenheit
#include<stdio.h>
float toF(int C) {
    return (C * 9.0 / 5.0) + 32;
}
void main() {
    int C;
    scanf("%d",&C);
    float F = toF(C);
    printf("Fahrenheit is %.2f.",F);
}
