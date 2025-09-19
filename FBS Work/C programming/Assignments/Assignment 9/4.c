//Find odd and even among the numbers.
#include<stdio.h>
void EvenOdd(int arr[5]){
	int evencount = 0, oddcount = 0;
	for(int i = 0;i<5;i++){
        if(arr[i] % 2 == 0){
            printf("%d is Even\n",arr[i]);
            evencount++;
        }
        else{
            printf("%d is Odd\n",arr[i]);
            oddcount++;
        }
    }
    printf("Total Even Numbers are %d\n",evencount);
    printf("Total Odd Numbers are %d\n",oddcount);
}
void main(){
    int arr[5];
    for(int i = 0;i<5;i++){
        printf("Enter Number %d:", i+1);
        scanf("%d",&arr[i]);
    }
    EvenOdd(arr);
    
}