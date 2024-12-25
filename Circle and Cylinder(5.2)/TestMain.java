public class TestMain {
    public static void main(String[] args) {

        // Testing the Circle class
        System.out.println("=== Testing Circle Class ===");
        Circle circle = new Circle(3.0, "blue");                   // Create a Circle with radius 3.0 and color blue
        System.out.println(circle);                                             // Print the Circle's details
        System.out.println("Circle Area: " + circle.getArea());                 // Calculate and display the Circle's area
        System.out.println();                                                   // Line break for readability

        // Testing the default Cylinder class
        System.out.println("=== Testing Default Cylinder Class ===");
        Cylinder cylinder1 = new Cylinder();                                    // Create a Cylinder using the default constructor
        System.out.println(cylinder1);                                          // Print the Cylinder's details
        System.out.println("Cylinder Volume: " + cylinder1.getVolume());        // Calculate and display the Cylinder's volume
        System.out.println();                                                   // Line break for readability

        // Testing the Cylinder with a custom base Circle and height
        System.out.println("=== Testing Cylinder with Custom Base Circle ===");
        Circle baseCircle = new Circle(6.0, "green");               // Create a base Circle with radius 6.0 and color green
        Cylinder cylinder2 = new Cylinder(baseCircle, 5.0);               // Create a Cylinder with the base Circle and height 5.0
        System.out.println(cylinder2);                                           // Print the Cylinder's details
        System.out.println("Cylinder Volume: " + cylinder2.getVolume());         // Calculate and display the Cylinder's volume
    }
}
