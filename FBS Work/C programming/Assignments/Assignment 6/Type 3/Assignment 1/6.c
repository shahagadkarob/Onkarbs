//Uppercase or Lowercase
#include<stdio.h>
void check_case(char ch) {
    if(ch>='A' && ch<='Z') printf("Uppercase");
    else printf("Lowercase");
}
void main() {
    char ch; scanf(" %c",&ch);
    check_case(ch);
}
