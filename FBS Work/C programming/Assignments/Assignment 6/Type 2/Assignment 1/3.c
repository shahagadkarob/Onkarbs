//Leap year check
#include<stdio.h>
int is_leap() {
    int y = 2000;
    return ((y%4==0 && y%100!=0) || (y%400==0));
}
void main() {
    if(is_leap()) printf("Leap");
    else printf("Not Leap");
}
