//Convert minutes to hours and minutes
#include<stdio.h>
void conv_min_ret(int mins,int *h,int *m) {
    *h = mins/60;
    *m = mins%60;
}
void main() {
    int mins;
    scanf("%d",&mins);
    int h,m;
    conv_min_ret(mins,&h,&m);
    printf("%d %d",h,m);
}
