//Menu driven operations
#include<stdio.h>
int menu(int n,int choice) {
    if(choice==1) {
        if(n%2==0) printf("Even"); else printf("Odd");
    } else if(choice==2) {
        int i,flag=1; if(n<=1) flag=0;
        for(i=2;i*i<=n;i++) if(n%i==0){ flag=0; break; }
        if(flag) printf("Prime"); else printf("Not Prime");
    } else if(choice==3) {
        int tmp=n,rev=0;
        while(tmp){ rev=rev*10+tmp%10; tmp/=10; }
        if(rev==n) printf("Palindrome"); else printf("Not Palindrome");
    } else if(choice==4) {
        if(n>0) printf("Positive"); else if(n<0) printf("Negative"); else printf("Zero");
    } else if(choice==5) {
        int tmp=n,rev=0;
        while(tmp){ rev=rev*10+tmp%10; tmp/=10; }
        printf("%d",rev);
    } else if(choice==6) {
        int sum=0,tmp=n;
        while(tmp){ sum+=tmp%10; tmp/=10; }
        printf("%d",sum);
    }
    return 0;
}
void main(){ int n,choice; scanf("%d %d",&n,&choice); menu(n,choice); }
