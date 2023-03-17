public class Student {
    private String firstName;
    private String lastName;
    private String fullName;
    private String broncoId;
    private double grade = -1;

    public Student(String firstName, String lastName, String broncoId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.broncoId = broncoId;
    }
    public String getFullName() {
        return fullName;
    }
    public String getBroncoId() {
        return broncoId;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double newGrade) {
        grade = newGrade;
    }
    public String toString() {
        String ret = String.format("Student: %s, Bronco ID: %s, Grade: %.2f", fullName, broncoId, grade);
        return ret;
    }
}
