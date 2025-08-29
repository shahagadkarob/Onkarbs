//Sum of numbers in given range. 
//Find sum of numbers from start to end. 
//Input: start = 1, end = 5 
//Output: 15 

#include<stdio.h>
void main(){
	int start,end,sum=0;
	printf("Enter starting number:");
	scanf("%d",&start);
	printf("Enter Ending number:");
	scanf("%d",&end);
	
	while(start <= end){
		sum = sum + start;
		start ++;		
	}
	printf("%d",sum);
}