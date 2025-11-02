class Book {
    int ISBN;
    String bName;
    String category;
    double price;

    void setISBN(int ISBN)
    {
        this.ISBN = ISBN;
    }
    void setbName(String str)
    {
        this.bName = str;
    }
    void setCategory(String cat)
    {
        this.category = cat;
    }
    void setPrice(double price)
    {
        this.price = price;
    }
}//Book class ends here

class testBook {
    public static void main(String args[]){
        Book b1 = new Book();

        b1.setISBN(101);
        b1.setbName("Java Programming");
        b1.setCategory("Education");
        b1.setPrice(550.50);

        System.out.println("Book ISBN:"+b1.ISBN+"\nBook Name:"+b1.bName+"\nBook Category:"+b1.category+"\nBook Price:"+b1.price);
    }
}//testBook class ends here
