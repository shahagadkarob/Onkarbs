//Find minimum and maximum number in array.
#include<stdio.h>
int min(int arr[],int n){
    int min = arr[0];
    for(int i = 0; i < n; i++){
        if(arr[i] < min){
            min = arr[i];
        }
    }
    return min;
}

int max(int arr[],int n){
    int max = arr[0];
    for(int i = 0; i < n; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    return max;
}
int main(){
    int n;
    printf("Enter the size of array:");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the elements of array:\n");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int minimum = min(arr,n);
    printf("\nThe minimum element in array is %d",minimum);

    int maximum = max(arr,n);
    printf("\nThe maximum element in array is %d",maximum);
}
