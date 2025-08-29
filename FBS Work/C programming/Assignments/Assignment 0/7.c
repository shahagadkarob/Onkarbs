//minutes into hours and minutes
#include<stdio.h>
void main() {
    int Total_minutes = 256;
    int hours = Total_minutes / 60;
    int minutes = Total_minutes % 60;
    printf("%d minutes is equal to %d hours and %d minutes.",Total_minutes,hours,minutes);
}