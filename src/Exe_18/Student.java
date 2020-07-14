package Exe_18;

public class Student {

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Student(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student " + firstName + " " + middleName + " " + lastName + " " + age;
    }

    public String getPassword() {
        String passoword = "" + firstName.charAt(0) + middleName.charAt(0) + lastName.charAt(0) + age;
        return passoword;
    }

}
