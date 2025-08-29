//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
//desired operations.
#include<stdio.h>
void main(){
	int a,b;
	printf("Enter 1st Number:");
	scanf("%d",&a);
	printf("Enter 2nd Number:");
	scanf("%d",&b);
	printf("Numbers are %d and %d\n",a,b);
	printf("Addition is:%d.\n",a+b);
	printf("Subtraction is:%d.\n",a-b);
	printf("Multipication is:%d.\n",a*b);
	printf("Division is:%d.\n",a/b);
	printf("Reminder is:%d.\n",a%b);
}