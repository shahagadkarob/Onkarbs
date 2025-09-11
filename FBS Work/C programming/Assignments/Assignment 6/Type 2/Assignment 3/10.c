//Sum of first and last digit
#include<stdio.h>
int sum_fl() {
    int n=12345;
    int last = n%10;
    int first = n;
    while(first>=10) first/=10;
    return first+last;
}
void main(){ printf("%d", sum_fl()); }
