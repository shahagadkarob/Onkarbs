//Check even or odd
#include<stdio.h>
void is_even(int n) {
    if(n%2==0) printf("Even");
    else printf("Odd");
}
void main() {
    int n;
    scanf("%d",&n);
    is_even(n);
}
