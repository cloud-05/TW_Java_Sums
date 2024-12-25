public class TestMain {
    public static void main(String[] args) {
        // Testing the Author class with basic details
        System.out.println("=== Testing Author Class ===");
        Author author1 = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(author1); // Print the first author

        Author author2 = new Author("Paul Tan", "paul@somewhere.com", 'm');
        System.out.println(author2); // Print the second author

        // Updating the email of the second author
        author2.setEmail("paul.tan@updatedemail.com");
        System.out.println("Updated Author 2: " + author2); // Confirm the email change

        // Testing the Book class with one author
        System.out.println("\n=== Testing Book Class with One Author ===");
        Book book1 = new Book("Hello World from me!", author1, 42, 99);
        System.out.println(book1); // Check the book details

        // Printing individual details of the book and its author
        System.out.println("Book Name: " + book1.getName());
        System.out.println("Book Price: $" + book1.getPrice());
        System.out.println("Book Quantity: " + book1.getQty());
        System.out.println("Book Author: " + book1.getAuthor());
        System.out.println("Author's Name: " + book1.getAuthor().getName());
        System.out.println("Author's Email: " + book1.getAuthor().getEmail());

        // Updating book price and quantity
        book1.setPrice(30);
        book1.setQty(28);
        System.out.println("\nUpdated Book 1:");
        System.out.println("Book Name: " + book1.getName());
        System.out.println("Updated Price: $" + book1.getPrice());
        System.out.println("Updated Quantity: " + book1.getQty());
        System.out.println("Author's Name: " + book1.getAuthorName());

        // Testing a new book with a different author
        System.out.println("\n=== Testing Another Book with a Different Author ===");
        Book book2 = new Book("Insights on TW!", author2, 29.95);
        System.out.println(book2); // Print book details

        // Displaying book details, including default quantity
        System.out.println("Book Name: " + book2.getName());
        System.out.println("Book Price: $" + book2.getPrice());
        System.out.println("Book Quantity (default 0): " + book2.getQty());
        System.out.println("Book Author: " + book2.getAuthor());
        System.out.println("Author's Name: " + book2.getAuthor().getName());
        System.out.println("Author's Email: " + book2.getAuthor().getEmail());

        // Testing inline creation of an Author while creating a Book
        System.out.println("\n=== Testing Book with Inline Author Creation ===");
        Book book3 = new Book("The Alchemist", new Author("Mantasha", "mantasha05@gmail.com", 'm'), 24.99,
                50);
        System.out.println(book3); // Print book details

        // Displaying author details for inline-created author
        System.out.println("Author's Name: " + book3.getAuthor().getName());
        System.out.println("Author's Email: " + book3.getAuthor().getEmail());
    }
}
