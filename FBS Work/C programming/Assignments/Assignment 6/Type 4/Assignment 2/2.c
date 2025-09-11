//Triangle type
#include<stdio.h>
const char* tri(int a,int b,int c) {
    if(a==b && b==c) return "Equilateral";
    else if(a==b || b==c || a==c) return "Isosceles";
    else return "Scalene";
}
void main(){ int a,b,c; scanf("%d %d %d",&a,&b,&c); printf("%s", tri(a,b,c)); }
