//Armstrong numbers in range 1 to n
#include<stdio.h>
void main() {
    int n;
    printf("Enter the value of n: ");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        int num = i, sum = 0, temp = i;
        while (num > 0) {
            int d = num % 10;
            sum += d * d * d;
            num /= 10;
        }
        if (sum == temp) {
            printf("%d ", temp);
        }
    }
}
