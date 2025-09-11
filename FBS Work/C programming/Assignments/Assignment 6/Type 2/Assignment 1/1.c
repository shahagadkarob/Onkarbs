//Check even or odd
#include<stdio.h>
int is_even() {
    int n = 10;
    return n%2==0;
}
void main() {
    if(is_even()) printf("Even");
    else printf("Odd");
}
