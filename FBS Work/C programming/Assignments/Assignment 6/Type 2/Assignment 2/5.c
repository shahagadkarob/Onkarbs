//Student discount
#include<stdio.h>
float final_price() {
    int price = 600;
    char s = 'y';
    float disc = 0;
    if(s=='y') { if(price>500) disc=0.20; else disc=0.10; }
    else { if(price>600) disc=0.15; else disc=0.0; }
    return price*(1-disc);
}
void main(){ printf("%.2f", final_price()); }
