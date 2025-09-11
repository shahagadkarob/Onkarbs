//Leap year check
#include<stdio.h>
int is_leap(int y) {
    return ((y%4==0 && y%100!=0) || (y%400==0));
}
void main() {
    int y; scanf("%d",&y);
    if(is_leap(y)) printf("Leap");
    else printf("Not Leap");
}
