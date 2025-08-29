//Write a program to check whether a given year is a leap year.

#include<stdio.h>
void main(){
	int year = 2003;
	if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ){
		printf("%d year is a leap year.",year);
	}
	else{
		printf("%d year is not a leap year.",year);
	}

}