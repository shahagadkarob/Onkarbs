//Palindrome check
#include<stdio.h>
int is_pal() {
    int n=121,tmp=n,rev=0;
    while(tmp){ rev=rev*10 + tmp%10; tmp/=10; }
    return rev==n;
}
void main(){ if(is_pal()) printf("Palindrome"); else printf("Not Palindrome"); }
