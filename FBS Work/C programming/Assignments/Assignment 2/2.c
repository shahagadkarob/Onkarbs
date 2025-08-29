//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.
//Equilateral ? All three sides equal
//Isosceles ? Any two sides equal
//Scalene ? All three sides different
#include<stdio.h>
void main(){
	int a, b, c;
	printf("Enter 1st Edge:");
	scanf("%d",&a);
	printf("Enter 2nd Edge:");
	scanf("%d",&b);
	printf("Enter 3rd Edge:");
	scanf("%d",&c);
	
	if(a==b && a==c){
		printf("These Edges are of Equilateral Triangle.");
	}
	else if (a==b || a==c || b==c){
		printf("These Edges are of Isosceles Triangle.");
	}
	else{
		printf("These Edges are of Scalene Triangle.");
	}
}

