//Reverse the given array.
#include<stdio.h>
void reve(int arr[],int n){
	for(int i=n-1;i>=0;i--){
    printf("%d ",arr[i]);
	}	
}
void main(){
	int n;
    printf("Enter the size of array: ");
    scanf("%d",&n);
    int arr[n];
    for(int i = 0;i<n;i++){
        printf("Enter Number %d:", i+1);
        scanf("%d",&arr[i]);
	}
	reve(arr,n);
}