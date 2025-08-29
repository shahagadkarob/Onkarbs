//prime number
#include<stdio.h>
void main(){
    int a = 5;
    int i = 2;
    while(i<a){
        if(a%i==0){
            printf("%d Number is not Prime",a);
            break;
        }
        if(i==a){
            printf("%d Number is Prime",a);
        }

        i++;
    }
}
