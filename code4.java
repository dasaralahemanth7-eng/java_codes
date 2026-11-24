class Book {
    String title;
    String author;
    double price;

   
    Book() {
        title = "Java";
        author = "Unknown";
        price = 200;
    }

    
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Python", "John", 350);

        System.out.println("Default Constructor:");
        b1.display();

        System.out.println("Parameterized Constructor:");
        b2.display();
    }
}
