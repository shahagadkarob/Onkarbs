//Swap two numbers using temporary variable
#include<stdio.h>
void swap() {
    int a = 5, b = 10;
    int temp = a;
    a = b;
    b = temp;
    printf("after swap a = %d b = %d.",a,b);
}
int do_swap() {
    swap();
    return 0;
}
void main() {
    do_swap();
}
