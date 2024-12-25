public class Book {
    private String name;
    private double price;
    private int qty;
    private Author[] authors;

    public Book(String name, Author[] authors, double price, int i) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.authors = new Author[] { author };
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (Author author : authors) {
            authorNames.append(author.getName()).append(", ");
        }
        return authorNames.length() > 0 ? authorNames.substring(0, authorNames.length() - 2) : "";
    }

    @Override
    public String toString() {
        return "Book[name=" + name + ", authors={" + getAuthorNames() + "}, price=" + price + ", qty=" + qty + "]";
    }
}
