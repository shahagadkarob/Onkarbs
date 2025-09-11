//Salary calculation
#include<stdio.h>
float total_salary(int basic) {
    float da,ta,hra;
    if(basic<=5000) { da=0.10*basic; ta=0.20*basic; hra=0.25*basic; }
    else { da=0.15*basic; ta=0.25*basic; hra=0.30*basic; }
    return basic+da+ta+hra;
}
void main() { int basic; scanf("%d",&basic); printf("%.2f", total_salary(basic)); }
