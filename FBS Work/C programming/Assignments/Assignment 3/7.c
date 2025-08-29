//7 Find factorial of given number. 
//Input: n = 5 
//Output: 120 
#include<stdio.h>
void main(){
	int n;
    printf("Enter a number: ");
    scanf("%d",&n);
	int temp = n;
	int sum = 1;
	while(n>0){
		sum = sum * n;
		n--;
	}
	printf("Factorial of %d is %d.",temp,sum);
}