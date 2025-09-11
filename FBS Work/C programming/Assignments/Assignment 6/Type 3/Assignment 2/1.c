//Simple calculator
#include<stdio.h>
void calc(int a,int b,char op) {
    if(op=='+') printf("%d",a+b);
    else if(op=='-') printf("%d",a-b);
    else if(op=='*') printf("%d",a*b);
    else if(op=='/') printf("%d",a/b);
    else if(op=='%') printf("%d",a%b);
}
void main(){ int a,b; char op; scanf("%d %d %c",&a,&b,&op); calc(a,b,op); }
