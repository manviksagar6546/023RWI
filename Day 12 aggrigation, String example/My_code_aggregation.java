class Address {
    private String street;
    private String city;
    private String zipCode;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + zipCode;
    }
}
class Student {
    private String name;
    private Address address; // Aggregation relationship

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + ", Address: " + address;
    }
}

public class My_code_aggregation {
    public static void main(String[] args) {
        // Creating an Address object
        Address address = new Address("123 Main St", "Springfield", "62701");

        // Creating a Student object with the Address object
        Student student = new Student("John Doe", address);

        // Displaying student details
        System.out.println(student);
    }
}
