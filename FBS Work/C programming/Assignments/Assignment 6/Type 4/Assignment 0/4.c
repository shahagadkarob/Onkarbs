//Swap two numbers using temporary variable (return swapped via pointers not allowed here, so return sum as dummy)
#include<stdio.h>
int swap_and_return_sum(int a,int b) {
    int temp = a;
    a = b;
    b = temp;
    return a + b;
}
void main() {
    int a,b;
    scanf("%d %d",&a,&b);
    int s = swap_and_return_sum(a,b);
    printf("sum after swap is %d.",s);
}
