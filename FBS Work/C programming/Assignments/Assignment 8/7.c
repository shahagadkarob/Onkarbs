//Take two array and add sum in third array
#include<stdio.h>
void main(){
    int n, m;
    
    printf("Enter size of first array: ");
    scanf("%d",&n);
    printf("Enter size of second array: ");
    scanf("%d",&m);
    int max = (n > m) ? n : m;
    int arr1[n];
    int arr2[m];
    int arr3[max];
    for(int i = 0; i < n; i++){
        printf("Enter element %d of first array: ", i+1);
        scanf("%d",&arr1[i]);
    }
    for(int i = 0; i < m; i++){
        printf("Enter element %d of second array: ", i+1);
        scanf("%d",&arr2[i]);
    }

    for(int i = 0; i < max; i++){
        arr3[i] = arr1[i]+arr2[i];
    }
     for(int i = 0; i < max; i++){
        printf("Element %d of third array is: %d\n", i+1, arr3[i]);
    }
}