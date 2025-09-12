//Triangle type
#include<stdio.h>
void tri(int *a,int *b,int *c) {
    if(*a==*b && *b==*c) 
    printf("Equilateral");
    else if(*a==*b || *b==*c || *a==*c) 
    printf("Isosceles");
    else 
    printf("Scalene");
}
void main(){ 
    int a,b,c; 
    printf("Enter sides if Triangle:");
    scanf("%d %d %d",&a,&b,&c); 
    tri(&a,&b,&c); }
