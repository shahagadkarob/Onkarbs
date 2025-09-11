//Table of given number
#include<stdio.h>
int table() {
    int n = 5;
    int i;
    for(i=1;i<=10;i++) {
        printf("%d", n*i);
        if(i<10) printf(" ");
    }
    return 0;
}
void main(){ table(); }
