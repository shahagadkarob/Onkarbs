//Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect
#include<stdio.h>
void main(){
	int n;
	int i=1 , sum = 0;
	printf("Enter the Number:");
	scanf("%d",&n);
	int temp = n;
	while(i<=n/2){
		if(n % i == 0){
			sum = sum + i;
		}
		i++;
	}
	if(sum == n){
		printf("%d is Perfect Number",temp);
	}
	else{
		printf("%d is Perfect Number",temp);
	}
	
}