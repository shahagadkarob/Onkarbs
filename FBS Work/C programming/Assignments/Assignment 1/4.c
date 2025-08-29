//Write a program to check whether a given character is a vowel or consonant.

#include<stdio.h>
void main(){
	char ch = 'm';
	if(ch == 'a'||ch == 'e'|| ch == 'i'||ch =='o'||ch == 'u'){
		printf("Given charachter is Vowel.");
	}
	else{
		printf("Given charachter is Consonant.");
	}
}