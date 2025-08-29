//Accept a number and check if it is divisible by 3, 5, or both.
//(Print "Divisible by 3 but not by 5" or "Divisible by 5 but not by 3" or "Divisible by
//both" or” Divisible by None”)
#include<stdio.h>
void main(){
	int num;
	printf("Enter a Number:");
	scanf("%d",&num);
	printf("Your Number is %d\n",num);
	if(num % 3 ==0 && num % 5 == 0){
		printf("%d Number is divisible by Both 3 and 5",num);
	}
	else if(num % 3 == 0 || num % 5 !=0){
		printf("%d Number is divisible by 3 not by 5",num);
	}
	else if(num % 3 != 0 || num % 5 ==0){
		printf("%d Number is divisible by  5 not by 3",num);
	}
	else{
		printf("%d Number is not divisible by Both 3 and 5",num);
	}
}
