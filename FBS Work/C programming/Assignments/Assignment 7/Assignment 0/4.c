//Swap two numbers using temporary variable
#include<stdio.h>
void swap(int *a,int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
    printf("\nafter swap a = %d b = %d.",*a,*b);
}
void main() {
    int a,b;
    printf("Enter the 2 Numbers:");
    scanf("%d %d",&a,&b);
    printf("before swap a = %d b = %d.",a,b);
    swap(&a,&b);
}
    