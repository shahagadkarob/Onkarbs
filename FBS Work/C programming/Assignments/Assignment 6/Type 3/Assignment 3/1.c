//Print numbers 1 to 10
#include<stdio.h>
void print10(int dummy) {
    int i;
    for(i=1;i<=10;i++) {
        printf("%d",i);
        if(i<10) printf(" ");
    }
}
void main(){ int d; scanf("%d",&d); print10(d); }
