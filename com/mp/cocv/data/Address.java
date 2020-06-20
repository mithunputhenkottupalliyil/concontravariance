package data;

public class Address extends Data{

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

