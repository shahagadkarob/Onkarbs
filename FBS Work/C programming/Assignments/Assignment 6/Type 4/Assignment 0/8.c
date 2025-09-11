//Perimeter of rectangle
#include<stdio.h>
int peri(int l,int w) {
    return 2*(l+w);
}
void main() {
    int l,w;
    scanf("%d %d",&l,&w);
    printf("%d",peri(l,w));
}
