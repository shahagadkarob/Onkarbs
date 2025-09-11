//Voting eligibility
#include<stdio.h>
void can_vote(int age) {
    if(age>=18) printf("Eligible");
    else printf("Not Eligible");
}
void main() {
    int age; scanf("%d",&age);
    can_vote(age);
}
