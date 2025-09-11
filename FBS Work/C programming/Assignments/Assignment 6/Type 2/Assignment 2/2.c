//Triangle type
#include<stdio.h>
const char* tri() {
    int a=3,b=4,c=5;
    if(a==b && b==c) return "Equilateral";
    else if(a==b || b==c || a==c) return "Isosceles";
    else return "Scalene";
}
void main(){ printf("%s", tri()); }
