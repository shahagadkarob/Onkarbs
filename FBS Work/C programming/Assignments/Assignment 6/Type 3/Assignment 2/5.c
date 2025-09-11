//Student discount
#include<stdio.h>
void final_price(int price,char s) {
    float disc = 0;
    if(s=='y') { if(price>500) disc=0.20; else disc=0.10; }
    else { if(price>600) disc=0.15; else disc=0.0; }
    printf("%.2f", price*(1-disc));
}
void main(){ int price; char s; scanf("%d %c",&price,&s); final_price(price,s); }
