//Celsius to Fahrenheit
#include<stdio.h>
void toF(int C) {
    float F = (C * 9.0 / 5.0) + 32;
    printf("Fahrenheit is %.2f.",F);
}
void main() {
    int C;
    scanf("%d",&C);
    toF(C);
}
