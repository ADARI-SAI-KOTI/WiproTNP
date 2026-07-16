/*Create a class Author with the following information.Member variables : name (String), email (String), and gender (char)Parameterized Constructor: To initialize the variablesCreate a class Book with the following information.Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)[Assumption: Each book will be written by exactly one Author]Parameterized Constructor: To initialize the variablesGetters and Setters for all the member variablesIn the main method, create a book object and print all details of the book (including the author details)*/
class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

public class Main {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", "jk@gmail.com", 'F');
        Book book = new Book("Harry Potter", author, 499.99, 10);

        System.out.println("Book Name: " + book.getName());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Quantity in Stock: " + book.getQtyInStock());
        System.out.println("Author Name: " + book.getAuthor().getName());
        System.out.println("Author Email: " + book.getAuthor().getEmail());
        System.out.println("Author Gender: " + book.getAuthor().getGender());
    }
}