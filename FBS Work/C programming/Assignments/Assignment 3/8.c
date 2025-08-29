//Check the given number is Strong number or not.
//Input: n = 145
//Output: Strong
#include<stdio.h>
void main(){
	int n;
    printf("Enter a number: ");
    scanf("%d",&n);
	int temp = n;
	int sum = 0;

	while(n>0){
		int rem = n % 10;
		n = n/10;
		int fact = 1;
		while(rem>0){
		fact = fact * rem;
		rem--;
		}
		sum = sum + fact;
	}
	
	if(temp == sum){
		printf("%d is Storng Number",temp);
	}
	else{
		printf("%d is not Storng Number",temp);
	}

}