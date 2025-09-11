//Celsius to Fahrenheit
#include<stdio.h>
float toF() {
    int C = 25;
    return (C * 9.0 / 5.0) + 32;
}
void main() {
    float f = toF();
    printf("Fahrenheit is %.2f.",f);
}
