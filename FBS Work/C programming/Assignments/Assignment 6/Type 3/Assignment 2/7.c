//Age group
#include<stdio.h>
void group(int age) {
    if(age<12) printf("Child");
    else if(age<=19) printf("Teenager");
    else if(age<=59) printf("Adult");
    else printf("Senior");
}
void main(){ int age; scanf("%d",&age); group(age); }
