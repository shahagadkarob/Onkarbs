//Menu driven program
#include<stdio.h>
void main() {
    int n, ch;
    printf("Enter the value of n: ");
    scanf("%d", &n);
    printf("1. Check Even or Odd\n2. Check Prime or Not\n3. Check Palindrome or Not\n4. Check Positive, Negative or Zero\n5. Reverse the number\n6. Sum of digits\n");
    printf("Enter your choice: ");
    scanf("%d", &ch);

    if (ch == 1) {
        if (n % 2 == 0) printf("Even");
        else printf("Odd");
    }
    else if (ch == 2) {
        int flag = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 1 && n > 1) printf("Prime");
        else printf("Not Prime");
    }
    else if (ch == 3) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (rev == n) printf("Palindrome");
        else printf("Not Palindrome");
    }
    else if (ch == 4) {
        if (n > 0) printf("Positive");
        else if (n < 0) printf("Negative");
        else printf("Zero");
    }
    else if (ch == 5) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        printf("%d", rev);
    }
    else if (ch == 6) {
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        printf("%d", sum);
    }
}
