//Check the given number is Palindrome number or not. 
//Input: n = 121 
//Output: Palindrome 
#include<stdio.h>
void main(){
	int no;
	printf("Enter a Number:");
	scanf("%d",&no);
	int rem,temp = no,sum =0;
	while(no>0){
		rem = no % 10;//1//2//1
		no = no / 10;//12//1
		sum = sum*10 + rem;//1//12//121
		
	}
	if(sum == temp){
		printf("%d is a palidrom number ",temp);
	}
	else{
		printf("%d is not a palidrom number",temp);
	}
}