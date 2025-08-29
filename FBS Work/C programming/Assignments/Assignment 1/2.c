//Write a program to check given 3 digit number is pallindrome or not.
#include<stdio.h>
void main(){
	int num = 434;
	int d1,d2,d3,q1;
	d1 = num % 10;
	q1 = num / 10;
	d2 = q1 % 10;
	d3 = q1 / 10;
//	printf("%d.%d.%d",d1,d2,d3);
	int rev = d1*100 + d2*10 + d3;
//	printf("%d",rev);
	if(num = rev){
		printf("The give Number %d is a palindrom",num);
	}
	else{
		printf("The give Number %d is not A palindrom",num);
	}
}