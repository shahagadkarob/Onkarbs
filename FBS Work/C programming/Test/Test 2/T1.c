#include<stdio.h>
void main(){
    int start, end;
    printf("Enter start of range: ");
    scanf("%d", &start);
    printf("Enter end of range: ");
    scanf("%d", &end);
	int sum = 0;
	for(int i=start;i<=end;i=i+2){
		sum = sum+i;
	}

	printf("sum is: %d",sum);
	
}