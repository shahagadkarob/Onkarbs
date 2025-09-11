//Perimeter of rectangle
#include<stdio.h>
void peri(int l,int w) {
    printf("%d",2*(l+w));
}
void main() {
    int l,w;
    scanf("%d %d",&l,&w);
    peri(l,w);
}
