// Find Sum of first and last digit of given number. 
// Input: n = 12345 
// Output: 6 (1 + 5)
#include<stdio.h>
void main(){
    int no = 124;
    int temp = no;
    int ld = no % 10;
    while(no>10){
        no = no / 10;
    }
    int sum = ld + no;
    printf("First and Last digit Sum of %d is %d",temp,sum);
        
}