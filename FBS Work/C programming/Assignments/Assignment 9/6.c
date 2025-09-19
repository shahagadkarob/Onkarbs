//Accept array and print only prime numbers of array.

#include<stdio.h>
void PrimeNo(int arr[],int n){
	for(int i = 0; i < n; i++) {
    int num = arr[i];
    int isPrime = 1;
    if(num < 2) 
    isPrime = 0;
    else {
        for (int j = 2; j * j <= num; j++) {
            if (num % j == 0) {
            isPrime = 0; 
            break;
            }
        }
    }
    
    if(isPrime) {
        printf("%d ", num);
    }
}
	
}
void main(){
    int n;
    printf("Enter the size of array: ");
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        printf("Enter element %d:",i+1);
        scanf("%d",&arr[i]);
    }
    PrimeNo(arr,n);
}