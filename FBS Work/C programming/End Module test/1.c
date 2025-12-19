//1. Write a program to calculate sum of following series:
//  1!+2!+......... +n!


#include<stdio.h>
int sumOfSeries(int number){
	int fact;
	int sum = 0;
	for(int i = 1; i <= number; i++) {
        fact = 1;
        for(int j = 1; j <= i; j++) {
			fact = fact * j;
		}
        	sum = sum + fact; 
        	
    }   return sum;
}


void main(){
	int number;
	printf("Enter the Number up To which u want to find the Factorial:");
	scanf("%d",&number);
	int result  = sumOfSeries(number);
	printf("Sum of series 1! + 2! + ... + %d! = %d\n", number,result);
}