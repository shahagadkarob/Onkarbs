//Find minimum and maximum number in array.

#include<stdio.h>
void main(){
    int arr[5];
    for(int i = 0; i < 5; i++){
        printf("Enter Number %d:", i+1);
        scanf("%d",&arr[i]);
    }
        int max = arr[0];
        int min = arr[0];
    for(int i = 0; i < 5; i++){
        if(arr[i] > max){
            max = arr[i];
        }
        if(arr[i] < min){
            min = arr[i];
        }
    }
    printf("Maximum Number is %d\n", max);
    printf("Minimum Number is %d\n", min);
}