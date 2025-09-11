//3-digit palindrome check
#include<stdio.h>
int is_pal(int n) {
    int t = n, rev = 0;
    while(t) { rev = rev*10 + t%10; t/=10; }
    return rev==n;
}
void main() {
    int n; scanf("%d",&n);
    if(is_pal(n)) printf("Palindrome");
    else printf("Not Palindrome");
}
