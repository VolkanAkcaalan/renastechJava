package OOP;

public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return ("Title of book : " + getTitle() +
                "\n" + "Author of book : " + getAuthor() +
                "\n" + "Price of the book : " + getPrice() + " Dollar");

    }
}