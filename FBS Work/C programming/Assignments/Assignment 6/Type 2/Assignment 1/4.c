//Vowel or Consonant
#include<stdio.h>
int is_vowel() {
    char ch = 'a';
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
       ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') return 1;
    return 0;
}
void main() {
    if(is_vowel()) printf("Vowel");
    else printf("Consonant");
}
