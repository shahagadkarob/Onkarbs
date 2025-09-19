// Print alternate elements in array.
#include<stdio.h>
void main(){
    int arr[5];
    for(int i = 0; i < 5; i++){
        printf("Enter Number %d:", i+1);
        scanf("%d",&arr[i]);
    }
    for(int i = 0; i < 5; i += 2){
        printf("Alternate Element at index %d: %d\n", i, arr[i]);
    }

}