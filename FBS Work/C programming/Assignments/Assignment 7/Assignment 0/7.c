//Convert minutes to hours and minutes
#include<stdio.h>
void conv_min(int *mins) {
    int h = *mins/60;
    int m = *mins%60;
    printf("%d Hours %d minutes",h,m);
}
void main() {
    int mins;
    printf("Enter the minutes:");
    scanf("%d",&mins);
    conv_min(&mins);
}

