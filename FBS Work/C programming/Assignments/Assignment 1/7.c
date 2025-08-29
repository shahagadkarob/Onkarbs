//Calculating total salary based on basic. If basic <=5000 da, ta and hra will be
//10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30%
//respectively.

#include<stdio.h>
void main(){
	int basic = 7000;
	float da, ta, hra, total_sal;
	if(basic <= 5000){
		da = basic * 0.10;
		ta = basic * 0.20;
		hra = basic * 0.25;
		total_sal = basic + da + ta + hra;
		printf("Salary of da ,ta and hra is %f,%f and %f\n",da,ta,hra);
		printf("Total salary is %f\n",total_sal);
		
	}
	else{
		da = basic * 0.15;
		ta = basic * 0.25;
		hra = basic * 0.30;
		total_sal = basic + da + ta + hra;
		printf("Salary of da ,ta and hra is %f,%f and %f\n",da,ta,hra);
		printf("Total salary is %f\n",total_sal);
		
	}
}