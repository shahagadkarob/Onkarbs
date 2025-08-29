//Swapping of 2 Numbers
#include<stdio.h>
void main() {
    int a =5,b =10,temp;
    printf("Before swapping: a = %d, b = %d.",a,b);
    temp = a;
    a=b;
    b=temp;
   printf("After swapping: a = %d, b = %d.",a,b);
}