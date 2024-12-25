public class TestMain {
    public static void main(String[] args) {

        // Testing the Person class
        System.out.println("=== Testing Person Class ===");
        Person person = new Person("John Doe", "123 Main St");
        System.out.println(person); // Print initial details of the person

        // Updating the person's address
        person.setAddress("456 Park Ave");
        System.out.println("Updated Address: " + person.getAddress());
        System.out.println(); // Add a line break for cleaner output

        // Testing the Student class
        System.out.println("=== Testing Student Class ===");
        Student student = new Student("sam", "otty", "Computer Science", 3, 12000.50);
        System.out.println(student); // Print initial details of the student

        // Updating student's year and fee
        student.setYear(4);
        student.setFee(12500.75);
        System.out.println("Updated Year: " + student.getYear() + ", Updated Fee: " + student.getFee());
        System.out.println(); // Add a line break for cleaner output

        // Testing the Staff class
        System.out.println("=== Testing Staff Class ===");
        Staff staff = new Staff("Ms Maria", "Gloria Sunshine Apt", "SRP High School", 50000.00);
        System.out.println(staff); // Print initial details of the staff member

        // Updating the staff's pay
        staff.setPay(55000.00);
        System.out.println("Updated Pay: " + staff.getPay());
    }
}
