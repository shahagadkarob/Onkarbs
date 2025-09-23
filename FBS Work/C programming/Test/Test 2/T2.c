#include <stdio.h>

void main() {
    int start, end;

    printf("Enter start of range: ");
    scanf("%d", &start);
    printf("Enter end of range: ");
    scanf("%d", &end);

    printf("Odd numbers: ");
    for (int i = start; i <= end; i++) {
        if (i % 2 != 0) {
            printf("%d ", i);
        }
    }

    printf("\nEven numbers: ");
    for (int i = start; i <= end; i++) {
        if (i % 2 == 0) {
            printf("%d ", i);
        }
    }
}
