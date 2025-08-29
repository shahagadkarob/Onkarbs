//Accept the price from user. Ask the user if he is a student (user may say y or n). If he
//is a student and he has purchased more than 500 than discount is 20% otherwise
//discount is 10%.But if he is not a student then if he has purchased more than 600
//discount is 15% otherwise there is not discount.
#include<stdio.h>
void main(){
	int price;
	char is_student;
	double Discount;
	printf("Enter the Price:");
	scanf("%d",&price);
	printf("Are you Student ? (y/n):");
	fflush(stdin);
	scanf("%c",&is_student);
	
	if(price >500 && is_student== 'y'){
		Discount = price * 0.20;
		printf("Total Amount with Disount is %lf", price - Discount);
	}
	else if(price < 500 && is_student == 'y'){
		Discount = price * 0.10;
		printf("Total Amount with Disount is %lf",price - Discount);
	}
	else if(price > 600 || is_student == 'n'){
		Discount = price * 0.16;
		printf("Total Amount with Disount is %lf",price - Discount);
	}
		
	
	
	
}