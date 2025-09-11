//3-digit palindrome check
#include<stdio.h>
int is_pal() {
    int n = 121;
    int t = n, rev = 0;
    while(t) { rev = rev*10 + t%10; t/=10; }
    return rev==n;
}
void main() {
    if(is_pal()) printf("Palindrome");
    else printf("Not Palindrome");
}
