#include<stdio.h>
void checkNum(int num);
void main(){
    int num;
    printf("Enter a number: ");
    scanf("%d",&num);
    checkNum(num);
}
void checkNum(int num){
    if(num<0){
        printf("Number is negative");
    }
    else if(num>0){
        printf("Number is positive");
    }
    else{
        printf("Number is zero");
    }
}
