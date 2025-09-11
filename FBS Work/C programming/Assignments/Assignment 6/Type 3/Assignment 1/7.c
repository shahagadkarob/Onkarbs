//Salary calculation
#include<stdio.h>
void total_salary(int basic) {
    float da,ta,hra;
    if(basic<=5000) { da=0.10*basic; ta=0.20*basic; hra=0.25*basic; }
    else { da=0.15*basic; ta=0.25*basic; hra=0.30*basic; }
    printf("%.2f", basic+da+ta+hra);
}
void main() { int basic; scanf("%d",&basic); total_salary(basic); }
