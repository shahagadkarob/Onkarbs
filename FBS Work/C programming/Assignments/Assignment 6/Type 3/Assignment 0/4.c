//Swap two numbers using temporary variable
#include<stdio.h>
void swap(int a,int b) {
    int temp = a;
    a = b;
    b = temp;
    printf("after swap a = %d b = %d.",a,b);
}
void main() {
    int a,b;
    scanf("%d %d",&a,&b);
    swap(a,b);
}
