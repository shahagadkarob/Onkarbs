//Sort the array.
#include<stdio.h>
void sort(int arr[],int n){
	
	for(int j=0;j<=4;j++){
        for(int i=0;i<4-j;i++){
        	if(arr[i]>arr[i+1]){
            int temp  = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        	}	
    	}
    }
    for(int i=0;i<5;i++){
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
	
	sort(arr,n);
	
}