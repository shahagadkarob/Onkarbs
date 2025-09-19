//Find sum of all numbers.
#include<stdio.h>
void main(){
    int arr[5];
    for(int i = 0;i<5;i++){
        printf("Enter Number %d:", i+1);
        scanf("%d",&arr[i]);
    }
    int sum = 0;
    for(int i=0;i<5;i++){
        sum += arr[i];
    }
    printf("\nSum of all numbers is :%d",sum);
    prinf("\nAverage is :%f",sum/5.0);
}
