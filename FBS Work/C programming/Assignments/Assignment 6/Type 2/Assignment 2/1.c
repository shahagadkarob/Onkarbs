//Simple calculator
#include<stdio.h>
int calc() {
    int a=10,b=3; char op='+';
    if(op=='+') return a+b;
    else if(op=='-') return a-b;
    else if(op=='*') return a*b;
    else if(op=='/') return a/b;
    else return a%b;
}
void main(){ printf("%d",calc()); }
