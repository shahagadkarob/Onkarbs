//Uppercase or Lowercase
#include<stdio.h>
void check_case(char *ch) {
    if(*ch>='A' && *ch<='Z') 
        printf("Uppercase");
    else 
        printf("Lowercase");
}
void main() {
    char ch; 
    printf("Enter a character:");
    scanf(" %c",&ch);
    check_case(&ch);
}
