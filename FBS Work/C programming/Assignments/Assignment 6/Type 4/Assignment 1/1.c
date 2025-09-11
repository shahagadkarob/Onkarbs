//Check even or odd
#include<stdio.h>
int is_even(int n) {
    return n%2==0;
}
void main() {
    int n;
    scanf("%d",&n);
    if(is_even(n)) printf("Even");
    else printf("Odd");
}
