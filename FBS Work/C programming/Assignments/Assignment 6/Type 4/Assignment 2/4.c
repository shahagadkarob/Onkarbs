//Grade based on marks
#include<stdio.h>
const char* grade(int marks) {
    if(marks>75) return "Distinction";
    else if(marks>65) return "First Class";
    else if(marks>55) return "Second Class";
    else if(marks>=40) return "Pass Class";
    else return "Fail";
}
void main(){ int marks; scanf("%d",&marks); printf("%s", grade(marks)); }
