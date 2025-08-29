//Check the given number is Armstrong number or not.. 
//Input: n = 153 
//Output: Armstrong
#include<stdio.h>
void main(){
	int no;
	printf("Enter a Number:");
	scanf("%d",&no);
	int rem,temp = no,sum =0 ;
	while(no>0){
		rem = no % 10;//3
		no = no / 10;//15
		sum = sum + (rem*rem*rem);
		
	}
	if(sum == temp){
		printf("%d is a Armstrong Number.",temp);
	}
	else{
		printf("%d is a not a Armstrong Number.",temp);
	}
}