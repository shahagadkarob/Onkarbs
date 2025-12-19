#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct Book {
	int id;
	char name[50];
	char author[50];
	char type[50];
	float price;
	float rate;
};

struct Book *bookList = NULL;
int total = 0;


void loadDefaults();
void showAll();
void addBook();
void removeBookById();
void removeBookByName();
void removeBookMenu();
void searchById();
void searchByName();
void searchMenu();
void showByAuthor();
void showByCategory();
void updateBook();
void sortByPrice();
void sortByRating();
void sortMenu();
// Function Declarations Done....

void main(){
	loadDefaults();
	int choice;
	
	while(1){
	printf("\n*********** BOOK MANAGEMENT SYSTEM ***********\n");
        printf("1.Show All Books\n");
        printf("2.Add Book\n");
        printf("3.Remove Book\n");
        printf("4.Search Book\n");
        printf("5.Show Author's Books\n");
        printf("6.Show Category's Books\n");
        printf("7.Update Book\n");
        printf("8.Sort Menu\n");
        printf("9.Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);	

		switch(choice){
			case 1: showAll(); break;
	        case 2: addBook(); break;
	        case 3: removeBookMenu(); break;
	        case 4: searchMenu(); break;
	        case 5: showByAuthor(); break;
	        case 6: showByCategory(); break;
	        case 7: updateBook(); break;
	        case 8: sortMenu(); break;
	        case 9:
	            printf("\nThanks for using the system\n");
	            free(bookList);
	            return 0;
	        default:
	        	printf("Invalid input, try again\n");
		}
	}
}

// ......Functions.....

void loadDefaults(){
	total = 6;
	bookList = (struct Book*) malloc(total * sizeof(struct Book));
	if(bookList == NULL){
		printf("Memory allocation failed\n");
		exit(1);
	}
	bookList[0] = (struct Book){101, "Java Programming", "James Gosling", "Programming", 550.0, 4.8};
    bookList[1] = (struct Book){102, "Python Crash Course", "Eric Matthes", "Programming", 650.0, 4.6};
    bookList[2] = (struct Book){103, "The Alchemist", "Paulo Coelho", "Fiction", 300.0, 4.3};
    bookList[3] = (struct Book){104, "C++ Primer", "Stanley Lippman", "Programming", 700.0, 4.7};
    bookList[4] = (struct Book){105, "Wings of Fire", "A.P.J Abdul Kalam", "Biography", 250.0, 4.5};
    bookList[5] = (struct Book){106, "Atomic Habits", "James Clear", "Self-Help", 400.0, 4.9};

}// Default Done......


void showAll(){
	if(total == 0){
		printf("\n No Books Available.\n");
		return;
	}
	printf("\n%-5s %-25s %-20s %-15s %-10s %-5s\n", "ID", "Name", "Author", "Category", "Price", "Rate");
	printf("--------------------------------------------------------------------------------------------\n");
	for(int i=0;i<total;i++){
		printf("%-5d %-25s %-20s %-15s %-8.2f %-6.1f\n",
		bookList[i].id,bookList[i].name,bookList[i].author,bookList[i].type,bookList[i].price,bookList[i].rate);
	}	
}// Display All Done


void addBook(){
	struct Book b1;
	
	printf("\nEnter the Book ID: ");
	scanf("%d",&b1.id);
	getchar();


	printf("\nEnter the Book Name: ");
	gets(b1.name);
	
	printf("\nEnter the Author Name: ");
	gets(b1.author);
	
	printf("\nEnter the Book Category: ");
	gets(b1.type);
	
	printf("\nEnter the Book Price: ");
	scanf("%f",&b1.price);
	
	printf("\nEnter the Book Rating: ");
	scanf("%f",&b1.rate);
	
	total++;
	struct Book *temp = realloc(bookList, total * sizeof(struct Book));
	if(temp == NULL){
    	printf("Memory reallocation failed!\n");
    	exit(1);
	}
	bookList = temp;
	bookList[total - 1] = b1;
	printf("\nBook added successfully!\n");


}// Add Book Done


void removeBookById() {
	int id, found = 0;
    printf("\nEnter ID to delete: ");
    scanf("%d", &id);

    for(int i=0; i<total; i++) {
        if(bookList[i].id == id) {
            for(int j=i; j<total-1; j++) {
                bookList[j] = bookList[j+1];
            }
            total--;
            bookList = realloc(bookList, total * sizeof(struct Book));
            found = 1;
            printf("Book removed successfully\n");
            break;
        }
    }
    
    if(found == 0)
        printf("Book ID not found\n");
}//Remove Book By ID Done

void removeBookByName(){
	char name[60], found = 0;
    printf("\nEnter Book Name to delete: ");
    scanf(" %[^\n]", name);
    getchar();

    for (int i = 0; i < total; i++) {
        if (strcmp(bookList[i].name, name) == 0) {
            for (int j = i; j < total - 1; j++) {
                bookList[j] = bookList[j + 1];
            }
            total--;
            found = 1;
            printf("Book removed successfully!\n");
            break;
        }
    }
    if(found == 0)
        printf("Book ID not found\n");
}//Remove Book By Name Done


void removeBookMenu() {
	int choice;
	printf("\n1.Remove Book By ID\n2.Remove Book By Name\nEnter your choice: ");
    scanf("%d", &choice);
	if(choice == 1){
		removeBookById();
	}
	else if(choice == 2){
		removeBookByName();
	}
	else {
        printf("Invalid choice!\n");
    }
}//Remove Book Menu Done...

void searchById() {
    int id, found;
    char choice;

    do {
        found = 0;

        printf("\nEnter Book ID (or 0 to return to main menu): ");
        scanf("%d", &id);
        getchar();  // remove newline

        if(id == 0) {
            printf("Returning to main menu...\n");
            return;
        }

        for(int i = 0; i < total; i++) {
            if(bookList[i].id == id) {
                printf("\n%-5s %-25s %-20s %-15s %-10s %-5s\n",
                       "ID", "Name", "Author", "Category", "Price", "Rate");
                printf("--------------------------------------------------------------------------------------\n");

                printf("%-5d %-25s %-20s %-15s %-8.2f %-6.1f\n",
                       bookList[i].id, bookList[i].name, bookList[i].author,
                       bookList[i].type, bookList[i].price, bookList[i].rate);

                found = 1;
                break;
            }
        }

        if(!found) {
            printf("\n? Book not found! Try again? (y/n): ");
            scanf(" %c", &choice);
            getchar();

            if(choice == 'n' || choice == 'N') {
                printf("Returning to main menu...\n");
                return;
            }
        }

    } while(!found);
}
void searchByName() {
    char name[60];
    int found = 0;

    getchar(); // clear any leftover newline

    printf("\nEnter Book Name (case insensitive): ");
    scanf(" %[^\n]", name);
    getchar();

    printf("\n%-5s %-25s %-20s %-15s %-10s %-5s\n",
           "ID", "Name", "Author", "Category", "Price", "Rate");
    printf("--------------------------------------------------------------------------------------\n");

    for(int i = 0; i < total; i++) {
        if(strcasecmp(bookList[i].name, name) == 0) {
            printf("%-5d %-25s %-20s %-15s %-8.2f %-6.1f\n",
                   bookList[i].id, bookList[i].name, bookList[i].author,
                   bookList[i].type, bookList[i].price, bookList[i].rate);
            found = 1;
        }
    }

    if(!found) {
        printf("\n? No book found with this name.\n");
    }
}


void searchMenu() {
	int ch;
    printf("\n1.Search by ID\n2.Search by Name\nChoose: ");
    scanf("%d",&ch);
    if(ch == 1)
        searchById();
    else if(ch == 2)
        searchByName();
    else
        printf("Invalid option\n");
}// search menu Done...

void showByAuthor() {
    char author[50];
    int flag = 0;
    printf("\nEnter Author Name: ");
    scanf(" %[^\n]",author);
    getchar();
   	

    for(int i=0; i<total; i++) {
        if(strcasecmp(bookList[i].author, author) == 0) {
            printf("%d | %s | %.2f | %.1f\n",
            bookList[i].id, bookList[i].name, bookList[i].price, bookList[i].rate);
            flag = 1;
        }
    }
    if(flag == 0)
        printf("No books found for this author\n");
}// show by author Done...


void showByCategory() {
    char category[40];
    int flag = 0;
    printf("\nEnter Category: ");
    scanf(" %[^\n]",category);
    for(int i=0; i<total; i++) {
        if(strcasecmp(bookList[i].type, category) == 0) {
            printf("%d | %s | %.2f | %.1f\n",
            bookList[i].id, bookList[i].name, bookList[i].price, bookList[i].rate);
            flag = 1;
        }
    }
    if(flag == 0)
        printf("No books found in this category\n");
}// show by category Done..


void updateBook() {
	int id, found = 0;
	printf("\Enter Book ID to Update: ");
	scanf("%d",&id);
	
	for(int i=0;i<total;i++){
		if(bookList[i].id == id){
			printf("Enter the name of Author:");
			scanf(" %[^\n]",&bookList[i].author);
			printf("Enter new Price: ");
            scanf("%f", &bookList[i].price);
            printf("Enter new Rating: ");
            scanf("%f", &bookList[i].rate);
            printf("Book updated successfully\n");
            found = 1;
            break;
		}
	}
	if(found == 0)
        printf("Book ID not found\n");
}//Update Book Done...

void sortByPrice(){
	struct Book temp;
	for(int i=0; i<total-1; i++) {
    	for(int j=i+1; j<total; j++) {
        	if(bookList[i].price < bookList[j].price) {
            	struct Book temp = bookList[i];
            	bookList[i] = bookList[j];
            	bookList[j] = temp;
        	}
    	}
	}
	printf("\nBooks sorted by Rating (High to Low)\n");
    showAll();
}//Sort By Price Done..


void sortByRating(){
	struct Book temp;
	for(int i=0; i<total-1; i++) {
    	for(int j=i+1; j<total; j++) {
        	if(bookList[i].rate < bookList[j].rate) {
            	struct Book temp = bookList[i];
            	bookList[i] = bookList[j];
            	bookList[j] = temp;
        	}
    	}
	}
	printf("\nBooks sorted by Rating (High to Low)\n");
    showAll();
}//Sort By Price Done..


void sortMenu(){
	int choice;
	printf("\n1.Sort by Price\n2.Sort by Rating\nChoose: ");
	scanf("%d",&choice);
	
	if(choice == 1){
		sortByPrice();
	}
	else if(choice == 2){
		sortByRating();
	}
	else{
		printf("Invalid Choice\n");
	}
}//Sort menu Done...
