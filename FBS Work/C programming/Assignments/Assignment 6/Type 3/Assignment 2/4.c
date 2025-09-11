//Grade based on marks
#include<stdio.h>
void grade(int marks) {
    if(marks>75) printf("Distinction");
    else if(marks>65) printf("First Class");
    else if(marks>55) printf("Second Class");
    else if(marks>=40) printf("Pass Class");
    else printf("Fail");
}
void main(){ int marks; scanf("%d",&marks); grade(marks); }
