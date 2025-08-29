//Print table for given number. 
//Input: n = 5 
//Output: 5 10 15 20 25 30 35 40 45 50

#include<stdio.h>
void main(){
	int a,n,i=1;
	printf("Enter a number:");
	scanf("%d",&a);
	while(i<=10){
		n = a*i;
		i++;
		printf(" %d",n);
	}
}