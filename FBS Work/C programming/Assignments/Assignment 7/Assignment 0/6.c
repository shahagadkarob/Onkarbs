//Square and cube of a number
#include<stdio.h>
void sqcube(int *n) {
    int s = (*n)*(*n);
    int c = (*n)*(*n)*(*n);
    printf("square is %d cube is %d.",s,c);
}
void main() {
    int n;
    printf("Enter the Number:");
    scanf("%d",&n);
    sqcube(&n);
}
