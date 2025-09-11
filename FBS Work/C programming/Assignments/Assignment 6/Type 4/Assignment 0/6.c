//Square and cube of a number
#include<stdio.h>
void sqcube_ret(int n,int *s,int *c) {
    *s = n*n;
    *c = n*n*n;
}
void main() {
    int n;
    scanf("%d",&n);
    int s,c;
    sqcube_ret(n,&s,&c);
    printf("%d %d",s,c);
}
