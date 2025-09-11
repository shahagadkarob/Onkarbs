//Total marks and percentage
#include<stdio.h>
float marks(int a,int b,int c,int d,int e) {
    int total = a+b+c+d+e;
    printf("%d ",total);
    return total/5.0;
}
void main() {
    int a,b,c,d,e;
    scanf("%d %d %d %d %d",&a,&b,&c,&d,&e);
    printf("%.2f",marks(a,b,c,d,e));
}
