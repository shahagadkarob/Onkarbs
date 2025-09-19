// Search the given number in array.
#include<stdio.h>
void main(){
    int arr[5];
    for(int i = 0;i<5;i++){
        printf("Enter Number %d:", i+1);
        scanf("%d",&arr[i]);
    }
    int no , index =0;
    printf("Enter the number yoy want to search:");
    scanf("%d",&no);

    for(int i=0;i<5;i++){
        if(arr[i]==no){
            index = i;
        }
    }
    if(index==-1){
        printf("Number Not Found");
    }
    else{
        printf("Number Found at position %d",index+1);
    }

}
