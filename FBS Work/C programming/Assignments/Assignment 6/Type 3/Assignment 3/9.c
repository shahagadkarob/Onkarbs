//Palindrome check
#include<stdio.h>
void is_pal(int n) {
    int tmp=n,rev=0;
    while(tmp){ rev=rev*10 + tmp%10; tmp/=10; }
    if(rev==n) printf("Palindrome"); else printf("Not Palindrome");
}
void main(){ int n; scanf("%d",&n); is_pal(n); }
