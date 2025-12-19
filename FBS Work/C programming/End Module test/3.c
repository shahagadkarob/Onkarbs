// Create a structure to store mobile details (mid, mname, price and brand)
//Write a menu driven program to accept mobile details and display mobile
//details

#include <stdio.h>
#include <string.h>

struct Mobile  {
	int mid;
	char mname[20];
	float price;
	char brand[30];
};

struct Mobile m1[10];
int n = 0;



void acceptDetails(){
	printf("Enter Mobile Id:");
	scanf("%d",&m1[n].mid);
	getchar();
	
	printf("Enter Mobile Name: ");
    gets(m1[n].mname);
    
    printf("Enter Price: ");
    scanf("%f", &m1[n].price);
    getchar();
    
    printf("Enter Brand: ");
    gets(m1[n].brand);
    
    n++; 
    printf("Mobile added successfully!\n");
}

void displayDetails(){
	if(n == 0){
		printf("\n No Mobile recored found..");
		return;
	}
	
	printf("****************** Mobile detailes ************************");
	for(int i=0;i<n;i++){
		printf("\nMobile ID: %d\n",m1[i].mid);
        printf("Mobile Name: %s\n",m1[i].mname);
        printf("Price: %.2f\n",m1[i].price);
        printf("Brand: %s\n",m1[i].brand);
	}
}
void main(){
	int choice;
	
	do {
        printf("\nMenu:\n");
        printf("1. Add Mobile\n");
        printf("2. Display Mobiles\n");
        printf("3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d",&choice);
        getchar(); 

        switch(choice) {
            case 1:
                acceptDetails();
                break;
            case 2:
                displayDetails();
                break;
            case 3:
                printf("Exit program.\n");
                break;
            default:
                printf("Invalid choice\n");
        }

    } while(choice != 3);
}