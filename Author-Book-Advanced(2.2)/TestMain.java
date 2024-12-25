public class TestMain {
    public static void main(String[] args) {

        // Testing the Author class
        System.out.println("=== Testing Author Class ===");
        Author author1 = new Author("J.K. Rowling", "jkrowling@example.com", 'f');
        System.out.println(author1); // Check the initial state of the author

        Author author2 = new Author("George R.R. Martin", "grrmartin@example.com", 'm');
        System.out.println(author2); // Another author to work with

        // Updating an author's email
        author1.setEmail("newemail@hogwarts.com");
        System.out.println("Updated Author: " + author1); // Verify the email change

        // Testing the Book class with a single author
        System.out.println("\n=== Testing Book Class with One Author ===");
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1, 39.99, 100);
        System.out.println(book1); // Check initial book details

        // Access and print specific book details
        System.out.println("Book Name: " + book1.getName());
        System.out.println("Price: $" + book1.getPrice());
        System.out.println("Quantity: " + book1.getQty());
        System.out.println("Authors: " + book1.getAuthorNames());

        // Updating book details
        book1.setPrice(49.99); // Let's increase the price
        book1.setQty(120);     // Update the quantity
        System.out.println("Updated Book: " + book1); // Check the updated details

        // Testing the Book class with multiple authors
        System.out.println("\n=== Testing Book Class with Multiple Authors ===");
        Author[] authors = new Author[2];
        authors[0] = new Author("J.R.R. Tolkien", "tolkien@example.com", 'm');
        authors[1] = new Author("C.S. Lewis", "lewis@example.com", 'm');

        Book book2 = new Book("Fantasy Classics Collection", authors, 59.99, 50);
        System.out.println(book2); // Book with multiple authors
        System.out.println("Book Name: " + book2.getName());
        System.out.println("Price: $" + book2.getPrice());
        System.out.println("Quantity: " + book2.getQty());
        System.out.println("Authors: " + book2.getAuthorNames());

        // Update an author's email and confirm changes
        authors[0].setEmail("newemail@middleearth.com");
        System.out.println("\nUpdated Authors in Book 2:");
        for (Author author : book2.getAuthors()) {
            System.out.println(author); // Display each updated author
        }

        // Final book test: creating another book for good measure
        System.out.println("\n=== Testing Another Book ===");
        Author author3 = new Author("Mantasha", "mantasha05@gmail.com", 'f');
        Book book3 = new Book("The Textbook", author3, 29.99, 200);
        System.out.println(book3); // Check details for the third book
    }
}
