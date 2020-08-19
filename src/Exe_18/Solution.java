package Exe_18;

import java.util.Scanner;

public class Solution {

    static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        students.add(new Student("Shashank", "G", "Bhat", 22));
        students.add(new Student("Ram", "N", "Naik", 20));
        students.add(new Student("Ganesh", "K", "Hegde", 32));

        for (Student student : students)
            System.out.println(student + " password is " + student.getPassword());

        sc.close();
    }

}
