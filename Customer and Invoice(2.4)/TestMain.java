public class TestMain {
    public static void main(String[] args) {
        // Testing Customer Class
        System.out.println("=== Testing Customer Class ===");
        Customer customer1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println("Customer 1: " + customer1);

        // Test setters
        customer1.setDiscount(8);
        System.out.println("Updated Customer 1: " + customer1);

        // Test getters
        System.out.println("Customer ID: " + customer1.getId());
        System.out.println("Customer Name: " + customer1.getName());
        System.out.println("Customer Discount: " + customer1.getDiscount() + "%");

        // Testing Invoice Class
        System.out.println("\n=== Testing Invoice Class ===");
        Invoice invoice1 = new Invoice(101, customer1, 888.8);
        System.out.println("Invoice 1: " + invoice1);

        // Update invoice amount
        invoice1.setAmount(999.9);
        System.out.println("Updated Invoice 1: " + invoice1);

        // Test getters
        System.out.println("Invoice ID: " + invoice1.getId());
        System.out.println("Customer Associated with Invoice: " + invoice1.getCustomer());
        System.out.println("Invoice Amount: $" + invoice1.getAmount());
        System.out.println("Customer ID: " + invoice1.getCustomerId());
        System.out.println("Customer Name: " + invoice1.getCustomerName());
        System.out.println("Customer Discount: " + invoice1.getCustomerDiscount() + "%");

        // Calculate amount after discount
        System.out.printf("Amount After Discount: $%.2f%n", invoice1.getAmountAfterDiscount());

        // Additional Test Case: Another Customer and Invoice
        System.out.println("\n=== Testing Another Customer and Invoice ===");
        Customer customer2 = new Customer(100, "Mantasha", 15);
        System.out.println("Customer 2: " + customer2);

        Invoice invoice2 = new Invoice(102, customer2, 1200.5);
        System.out.println("Invoice 2: " + invoice2);

        System.out.println("Invoice 2 Customer Name: " + invoice2.getCustomerName());
        System.out.printf("Amount After Discount: $%.2f%n", invoice2.getAmountAfterDiscount());
    }
}
