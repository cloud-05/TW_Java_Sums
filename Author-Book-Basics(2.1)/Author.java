public class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    String getName() {
        return this.name;
    }

    String getEmail() {
        return this.email;
    }

    char getGender() {
        return this.gender;
    }

    void setEmail(String newMail) {
        this.email = newMail;
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }

    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);

        ahTeck.setEmail("paulTan@nowhere.com");
        System.out.println("Name is: " + ahTeck.getName());
        System.out.println("Email is: " + ahTeck.getEmail());
        System.out.println("Gender is: " + ahTeck.getGender());
    }
}
