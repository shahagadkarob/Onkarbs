//Voting eligibility
#include<stdio.h>
int can_vote(int age) {
    return age>=18;
}
void main() {
    int age; scanf("%d",&age);
    if(can_vote(age)) printf("Eligible");
    else printf("Not Eligible");
}
