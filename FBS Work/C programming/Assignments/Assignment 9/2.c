// Search the given number in array.
#include<stdio.h>

int searchElement(int arr[],int n){
	int no , index =0;
    printf("Enter the number yoy want to search:");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        if(arr[i]==n){
            index = i;
        }
    }  
    return index;
   
	
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
    int result = searchElement(arr,n);
    if(result==-1){
      printf("Number Not Found");
}
    else{
        printf("Number Found %d",result+1);
    }
   

}
