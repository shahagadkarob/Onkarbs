//Perimeter of rectangle
#include<stdio.h>
int peri() {
    int l=5,w=3;
    return 2*(l+w);
}
void main() {
    int p = peri();
    printf("perimeter is %d.",p);
}
