//Table of given number
#include<stdio.h>
void table(int n) {
    int i;
    for(i=1;i<=10;i++) {
        printf("%d", n*i);
        if(i<10) printf(" ");
    }
}
void main(){ int n; scanf("%d",&n); table(n); }
