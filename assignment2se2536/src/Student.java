public class Student extends Person {

    private double gpa;

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660.00;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}
