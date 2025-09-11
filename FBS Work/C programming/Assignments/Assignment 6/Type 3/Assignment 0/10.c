//Total marks and percentage
#include<stdio.h>
void marks(int a,int b,int c,int d,int e) {
    int total = a+b+c+d+e;
    float perc = total/5.0;
    printf("%d %.2f",total,perc);
}
void main() {
    int a,b,c,d,e;
    scanf("%d %d %d %d %d",&a,&b,&c,&d,&e);
    marks(a,b,c,d,e);
}
