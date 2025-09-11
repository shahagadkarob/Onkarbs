//Simple calculator
#include<stdio.h>
int calc(int a,int b,char op) {
    if(op=='+') return a+b;
    else if(op=='-') return a-b;
    else if(op=='*') return a*b;
    else if(op=='/') return a/b;
    else return a%b;
}
void main(){ int a,b; char op; scanf("%d %d %c",&a,&b,&op); printf("%d",calc(a,b,op)); }
