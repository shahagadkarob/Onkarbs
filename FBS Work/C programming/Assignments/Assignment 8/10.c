//Sort the array.
#include<stdio.h>
void main(){
    int arr[5] = {100,200,30,40,50};
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