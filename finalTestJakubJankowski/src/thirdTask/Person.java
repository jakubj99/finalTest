package thirdTask;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayInformation() {
        System.out.println("First name: " + firstName + ". Last name: " + lastName + ". Age: " + age);
    }

    public String getFirstName() {
        return firstName;
    }
}
