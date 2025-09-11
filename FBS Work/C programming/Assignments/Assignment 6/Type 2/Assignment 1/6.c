//Uppercase or Lowercase
#include<stdio.h>
int is_upper() {
    char ch = 'A';
    return (ch>='A' && ch<='Z');
}
void main() {
    if(is_upper()) printf("Uppercase");
    else printf("Lowercase");
}
