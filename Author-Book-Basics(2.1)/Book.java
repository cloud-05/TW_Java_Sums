
public class Book {
    private String name;
    private double price;
    private int qty;
    Author author;

    Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    Author getAuthor() {
        return this.author;
    }

    void setPrice(double price) {
        this.price = price;
    }

    int getQty() {
        return this.qty;
    }

    void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return author.getName();
    }
}
