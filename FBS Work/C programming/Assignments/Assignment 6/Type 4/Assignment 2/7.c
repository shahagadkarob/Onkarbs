//Age group
#include<stdio.h>
const char* group(int age) {
    if(age<12) return "Child";
    else if(age<=19) return "Teenager";
    else if(age<=59) return "Adult";
    else return "Senior";
}
void main(){ int age; scanf("%d",&age); printf("%s", group(age)); }
