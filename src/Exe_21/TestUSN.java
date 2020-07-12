package Exe_21;

public class TestUSN {

    /*
     * 1) Save digit and character position.
     * 
     * 2) Loop through USN check if position was suppose to be char or digit if
     * character check whether it is upper case letter if digit check it is position
     * 0 and it's 1 or 2.
     * 
     * 3) If position is 5th then take 2 letters and check it's valid branch name.
     * 
     * 4) If any of the above condition fails then return false otherwise true.
     * 
     */

    public static void main(String[] args) {

        String USN = "1DS09CS010";

        if (validate(USN))
            System.out.println("Success");
        else
            System.out.println("Failure");

    }

    private static boolean validate(String USN) {

        if (USN.length() != 10)
            return false;

        for (int i = 0; i < 10; i++) {

            char currentChar = USN.charAt(i);

            if (Utils.numberPositions.contains(i) && Character.isDigit(currentChar)) {
                if (i == 0 && (currentChar != '1' && currentChar != '2'))
                    return false;

            } else if (Utils.characterPosiotions.contains(i) && Character.isUpperCase(currentChar)) {
                if (i == 5) {
                    String branch = USN.substring(i, i + 2);
                    if (!Utils.branchName.contains(branch))
                        return false;
                    i++;
                }
            } else
                return false;
        }

        return true;
    }

}
