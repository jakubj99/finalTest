package thirdTask;

public class Student extends Person {

    private int score;

    public Student(String firstName, String lastName, int age, int score) {
        super(firstName, lastName, age);
        this.score = score;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println(super.getFirstName() + "Your score " + score);
    }
}
