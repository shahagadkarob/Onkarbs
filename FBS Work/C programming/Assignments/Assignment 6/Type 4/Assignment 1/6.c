//Uppercase or Lowercase
#include<stdio.h>
int is_upper(char ch) {
    return (ch>='A' && ch<='Z');
}
void main() {
    char ch; scanf(" %c",&ch);
    if(is_upper(ch)) printf("Uppercase");
    else printf("Lowercase");
}
