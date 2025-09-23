// Que 1. WAP to calculate electricity bill.
// For 1-50 units 30 rs/unit, For 51-150 units 40 rs/unit, For 151 and above units 50 rs/unit.

#include<stdio.h>
int CalculateBill(int unites);
void main(){
    int unites;
    printf("Enter the number of unites: ");
    scanf("%d",&unites);
    int TotalBill = CalculateBill(unites);
    printf("Total Bill is: %d",TotalBill);
}
int CalculateBill(int unites){
    int bill;
    if(unites<=50){
        bill = unites * 30;
    }
    else if(unites>50 && unites<=150){
        bill = unites * 40;
    }
    else if(unites>150){
        bill = unites * 50;
    }
    return bill;
}