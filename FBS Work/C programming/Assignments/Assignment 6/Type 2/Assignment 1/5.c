//Voting eligibility
#include<stdio.h>
int can_vote() {
    int age = 20;
    return age>=18;
}
void main() {
    if(can_vote()) printf("Eligible");
    else printf("Not Eligible");
}
