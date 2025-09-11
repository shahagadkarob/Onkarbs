//Palindrome check
#include<stdio.h>
int is_pal(int n) {
    int tmp=n,rev=0;
    while(tmp){ rev=rev*10 + tmp%10; tmp/=10; }
    return rev==n;
}
void main(){ int n; scanf("%d",&n); if(is_pal(n)) printf("Palindrome"); else printf("Not Palindrome"); }
