//Leap year check
#include<stdio.h>
void is_leap(int y) {
    if((y%4==0 && y%100!=0) || (y%400==0)) printf("Leap");
    else printf("Not Leap");
}
void main() {
    int y; scanf("%d",&y);
    is_leap(y);
}
