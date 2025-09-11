//Strong numbers in range 1 to n
#include<stdio.h>
void main() {
    int n;
    printf("Enter the value of n: ");
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        int num = i, sum = 0, temp = i;
        while (num > 0) {
            int d = num % 10;
            int fact = 1;
            for (int k = 1; k <= d; k++) {
                fact *= k;
            }
            sum += fact;
            num /= 10;
        }
        if (sum == temp) {
            printf("%d ", i);
        }
    }
}
