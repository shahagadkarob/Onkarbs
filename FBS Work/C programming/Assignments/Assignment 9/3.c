//Find sum of all numbers.
#include<stdio.h>

int sum(int arr[5]){
	 int sum = 0;
    for(int i=0;i<5;i++){
        sum += arr[i];
    }
    return sum;
}
int avg(int Sum){
	int avg = Sum/5;
	return avg;
}

void main(){
    int arr[5];
    for(int i = 0;i<5;i++){
        printf("Enter Number %d:", i+1);
        scanf("%d",&arr[i]);
    }
    
   	int Sum = sum(arr);
    printf("\nSum of all numbers is :%d",Sum);

    int Avg = avg(Sum);
    printf("\nAverage of all numbers is :%d",Avg);
	
}
