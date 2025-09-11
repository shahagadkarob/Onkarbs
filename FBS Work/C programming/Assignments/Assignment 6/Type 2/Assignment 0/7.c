//Convert minutes to hours and minutes
#include<stdio.h>
void conv_min() {
    int mins = 130;
    int h = mins/60;
    int m = mins%60;
    printf("%d %d",h,m);
}
int do_conv(){ conv_min(); return 0; }
void main(){ do_conv(); }
