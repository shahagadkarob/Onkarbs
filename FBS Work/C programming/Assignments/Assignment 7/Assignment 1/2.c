//3-digit palindrome check
#include<stdio.h>
void is_pal(int *n) {
    int t = *n;
    int rev = 0;
    while(t) { 
        rev = rev*10 + t%10; 
        t/=10; 
    }
        if(rev==*n) 
        printf("Palindrome");
        else 
        printf("Not Palindrome");
}
void main() {
    int n; 
    printf("Enter a number:");
    scanf("%d",&n);
    is_pal(&n);
}
