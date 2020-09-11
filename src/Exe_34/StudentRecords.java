package Exe_34;

public class StudentRecords<T> extends ArrayList<T> {

    public void sortBasedOnBranch() {

        // Bubble sort
        for (int i = 0; i < size() - 1; i++) {
            for (int j = 0; j < size() - i - 1; j++) {

                String branch1 = ((Student)get(j)).getStudentBranch();
                String branch2 = ((Student)get(j+1)).getStudentBranch();

                if (branch1.compareTo(branch2) > 0)
                    swap(j, j + 1);

            }
        }

    }

    public void sortBasedOnID() {

        // Bubble sort
        for (int i = 0; i < size() - 1; i++) {
            for (int j = 0; j < size() - i - 1; j++) {

                int id1 = ((Student)get(j)).getStudentId();
                int id2 = ((Student)get(j+1)).getStudentId();

                if (id1 > id2)
                    swap(j, j + 1);

            }
        }

    }


    @Override
    public String toString() {
        
        String result = "";

        for (int i = 0; i < size(); i++) {
            result += ((Student)get(i)).toString();
            result += "\n";
        }
        
        return result;
    }
    
    

}
