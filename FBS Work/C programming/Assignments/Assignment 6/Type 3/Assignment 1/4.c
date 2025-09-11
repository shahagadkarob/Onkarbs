//Vowel or Consonant
#include<stdio.h>
void is_vowel(char ch) {
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
       ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') printf("Vowel");
    else printf("Consonant");
}
void main() {
    char ch; scanf(" %c",&ch);
    is_vowel(ch);
}
