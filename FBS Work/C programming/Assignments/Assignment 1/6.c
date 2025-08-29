//Write a program to check whether a given character is uppercase or lowercase.
//uppercase letters A through Z range from 65 to 90
//lowercase letters a through z, the ASCII values range from 97 to 122. 
 #include<stdio.h>
 void main(){
 	char ch = 'A' ;
 	if(ch>=65 && ch<= 90){
 	printf("%c character is Uppercase",ch);
	 }
	 else{
	 	printf("%c character is lowercase",ch);
	 }
 }