//Age group
#include<stdio.h>
const char* group() {
    int age = 25;
    if(age<12) return "Child";
    else if(age<=19) return "Teenager";
    else if(age<=59) return "Adult";
    else return "Senior";
}
void main(){ printf("%s", group()); }
