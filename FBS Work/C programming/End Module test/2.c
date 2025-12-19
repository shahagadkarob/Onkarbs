//2.Write a program to count the frequency of occurrence of each character.
//(eg. rare r-2, a-1, e-1)
#include <stdio.h>
#include <string.h>
void calculateFrequency(char str[]){
	int len = strlen(str);
	
	printf("\nFrequency of characters:\n");
	
	for(int i=0;i<len;i++){
		int found = 0;
        for(int j = 0; j < i; j++) {
            if(str[i] == str[j]) {
                found = 1;
                break;
            }
        }
        if(found)
            continue;

        int count = 0;
        for(int j = 0; j < len; j++) {
            if(str[i] == str[j])
                count++;
        }

        printf("%c - %d\n", str[i], count);
    }
}
	
void main() {
    char str[10];
    printf("Enter a string: ");
    gets(str);  // simple input
	calculateFrequency(str);

}