package Exe_34;

import java.util.ArrayList;

public class StudentRecords<T> extends ArrayList<T> {

    public void sortBasedOnBranch(StudentRecords<Student> records) {

        // Bubble sort
        for (int i = 0; i < records.size() - 1; i++) {
            for (int j = 0; j < records.size() - i - 1; j++) {

                String name1 = records.get(j).getStudentBranch();
                String name2 = records.get(j + 1).getStudentBranch();

                if (name1.compareTo(name2) > 0)
                    swap(records, j, j + 1);

            }
        }

    }

    public void sortBasedOnID(StudentRecords<Student> records) {

        // Bubble sort
        for (int i = 0; i < records.size() - 1; i++) {
            for (int j = 0; j < records.size() - i - 1; j++) {

                int id1 = records.get(j).getStudentId();
                int id2 = records.get(j + 1).getStudentId();

                if (id1 > id2)
                    swap(records, j, j + 1);

            }
        }

    }

    public void printRecords(StudentRecords<Student> records) {

        for (Student student : records)
            System.out.println(student);

    }

    private void swap(StudentRecords<Student> records, int m, int n) {
        Student temp1 = records.get(m);
        Student temp2 = records.get(n);

        records.set(m, temp2);
        records.set(n, temp1);
       
    }

}
