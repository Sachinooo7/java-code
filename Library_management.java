import java.util.Scanner;

class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayDetails();
    }
}

public class Library_management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Book 1:");
        System.out.print("Type: Fiction\nTitle: ");
        String fictionTitle = scanner.nextLine();
        System.out.print("Author: ");
        String fictionAuthor = scanner.nextLine();
        System.out.print("Price: ");
        double fictionPrice = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("\nBook 2:");
        System.out.print("Type: Non-Fiction\nTitle: ");
        String nonFictionTitle = scanner.nextLine();
        System.out.print("Author: ");
        String nonFictionAuthor = scanner.nextLine();
        System.out.print("Price: ");
        double nonFictionPrice = scanner.nextDouble();

        Fiction fictionBook = new Fiction(fictionTitle, fictionAuthor, fictionPrice);
        NonFiction nonFictionBook = new NonFiction(nonFictionTitle, nonFictionAuthor, nonFictionPrice);

        System.out.println("\n");
        fictionBook.displayDetails();
        System.out.println("\n");
        nonFictionBook.displayDetails();

        scanner.close();
    }
}
