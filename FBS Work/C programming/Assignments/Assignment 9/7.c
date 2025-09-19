#include <stdio.h>

void AddToAnother() {
    int n, m;
    printf("Enter size of first array: ");
    scanf("%d", &n);
    printf("Enter size of second array: ");
    scanf("%d", &m);

    int max = (n > m) ? n : m;
    int arr1[n], arr2[m], arr3[max];

    // Input first array
    for (int i = 0; i < n; i++) {
        printf("Enter element %d of first array: ", i + 1);
        scanf("%d", &arr1[i]);
    }

    // Input second array
    for (int i = 0; i < m; i++) {
        printf("Enter element %d of second array: ", i + 1);
        scanf("%d", &arr2[i]);
    }

    // Initialize arr3 with 0
    for (int i = 0; i < max; i++) {
        arr3[i] = 0;
    }

    // Add elements from first array
    for (int i = 0; i < n; i++) {
        arr3[i] += arr1[i];
    }

    // Add elements from second array
    for (int i = 0; i < m; i++) {
        arr3[i] += arr2[i];
    }

    // Print third array
    for (int i = 0; i < max; i++) {
        printf("Element %d of third array is: %d\n", i + 1, arr3[i]);
    }
}

int main() {
    AddToAnother();
    
}
