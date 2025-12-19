import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Comparator;


class Book {
    int id;
    String name;
    String author;
    String category;
    float price;
    float rating;

    Book(int id, String name, String author, String category, float price, float rating) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }
}

public class BookManagementSystem {

    static ArrayList<Book> bookList = new ArrayList<Book>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        loadDefaults();
        int choice;

        while (true) {
            System.out.println("\n******** BOOK MANAGEMENT SYSTEM ********");
            System.out.println("1. Show All Books");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Search Book");
            System.out.println("5. Show Author Books");
            System.out.println("6. Show Category Books");
            System.out.println("7. Update Book");
            System.out.println("8. Sort Books");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    showAll();
                    break;

                case 2:
                    addBook();
                    break;

                case 3:
                    removeBookMenu();
                    break;

                case 4:
                    searchMenu();
                    break;

                case 5:
                    showByAuthor();
                    break;

                case 6:
                    showByCategory();
                    break;

                case 7:
                    updateBook();
                    break;

                case 8:
                    sortMenu();
                    break;

                case 9:
                    System.out.println("Thanks for using the system");
                    return;

                default:
                    System.out.println("Invalid choice, try again");
            }
        }
    }

    // -------- DEFAULT BOOK DATA --------
    static void loadDefaults() {
        bookList.add(new Book(101, "Java Programming", "James Gosling", "Programming", 550, 4.8f));
        bookList.add(new Book(102, "Python Crash Course", "Eric Matthes", "Programming", 650, 4.6f));
        bookList.add(new Book(103, "The Alchemist", "Paulo Coelho", "Fiction", 300, 4.3f));
        bookList.add(new Book(104, "C++ Primer", "Stanley Lippman", "Programming", 700, 4.7f));
        bookList.add(new Book(105, "Wings of Fire", "A.P.J Abdul Kalam", "Biography", 250, 4.5f));
        bookList.add(new Book(106, "Atomic Habits", "James Clear", "Self-Help", 400, 4.9f));
    }

    // -------- SHOW ALL BOOKS --------
    static void showAll() {
        if (bookList.size() == 0) {
            System.out.println("No books available");
            return;
        }

        System.out.println("ID | Name | Author | Category | Price | Rating");
        for (Book b : bookList) {
            System.out.println(b.id + " | " + b.name + " | " + b.author + " | "
                    + b.category + " | " + b.price + " | " + b.rating);
        }
    }

    // -------- ADD BOOK --------
    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Price: ");
        float price = sc.nextFloat();

        System.out.print("Enter Rating: ");
        float rating = sc.nextFloat();

        bookList.add(new Book(id, name, author, category, price, rating));
        System.out.println("Book added successfully");
    }

    // -------- REMOVE MENU --------
    static void removeBookMenu() {
        System.out.println("1. Remove by ID");
        System.out.println("2. Remove by Name");
        System.out.print("Enter choice: ");

        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) {
            removeById();
        } else if (ch == 2) {
            removeByName();
        } else {
            System.out.println("Invalid option");
        }
    }

    static void removeById() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Iterator<Book> it = bookList.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.id == id) {
                it.remove();
                System.out.println("Book removed successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }

    static void removeByName() {
        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        Iterator<Book> it = bookList.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.name.equalsIgnoreCase(name)) {
                it.remove();
                System.out.println("Book removed successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }

    // -------- SEARCH MENU --------
    static void searchMenu() {
        System.out.println("1. Search by ID");
        System.out.println("2. Search by Name");
        System.out.print("Enter choice: ");

        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) {
            searchById();
        } else if (ch == 2) {
            searchByName();
        } else {
            System.out.println("Invalid option");
        }
    }

    static void searchById() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (Book b : bookList) {
            if (b.id == id) {
                System.out.println(b.id + " | " + b.name + " | " + b.author);
                return;
            }
        }
        System.out.println("Book not found");
    }

    static void searchByName() {
        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        for (Book b : bookList) {
            if (b.name.equalsIgnoreCase(name)) {
                System.out.println(b.id + " | " + b.name + " | " + b.author);
                return;
            }
        }
        System.out.println("Book not found");
    }

    // -------- AUTHOR & CATEGORY --------
    static void showByAuthor() {
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        for (Book b : bookList) {
            if (b.author.equalsIgnoreCase(author)) {
                System.out.println(b.id + " | " + b.name);
            }
        }
    }

    static void showByCategory() {
        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        for (Book b : bookList) {
            if (b.category.equalsIgnoreCase(category)) {
                System.out.println(b.id + " | " + b.name);
            }
        }
    }

    // -------- UPDATE BOOK --------
    static void updateBook() {
        System.out.print("Enter Book ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Book b : bookList) {
            if (b.id == id) {
                System.out.print("Enter New Author Name: ");
                b.author = sc.nextLine();

                System.out.print("Enter New Price: ");
                b.price = sc.nextFloat();

                System.out.print("Enter New Rating: ");
                b.rating = sc.nextFloat();

                System.out.println("Book updated successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }

    // -------- SORT MENU --------
    static void sortMenu() {
        System.out.println("1. Sort by Price");
        System.out.println("2. Sort by Rating");
        System.out.print("Enter choice: ");

        int ch = sc.nextInt();

        if (ch == 1) {
            sortByPrice();
        } else if (ch == 2) {
            sortByRating();
        } else {
            System.out.println("Invalid option");
        }
    }

    static void sortByPrice() {
        Collections.sort(bookList, new Comparator<Book>() {
            public int compare(Book b1, Book b2) {
                return Float.compare(b2.price, b1.price);
            }
        });
        showAll();
    }

    static void sortByRating() {
        Collections.sort(bookList, new Comparator<Book>() {
            public int compare(Book b1, Book b2) {
                return Float.compare(b2.rating, b1.rating);
            }
        });
        showAll();
    }
}
