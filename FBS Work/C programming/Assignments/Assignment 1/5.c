//Write a program to check whether a person is eligible to vote (age = 18).

#include<stdio.h>
void main(){
	int age = 23;
	if(age >= 18){
		printf("A person with age %d is eligible to vote.",age);
	}
	else{
		printf("A person with age %d is not eligible to vote.",age);
	}
}