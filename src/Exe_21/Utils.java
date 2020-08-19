package Exe_21;

public class Utils {

    public static final int[] numberPositions = new int[]{0,3,4,7,8,9};

    public static final int[] characterPosiotions = new int[]{1,2,5,6};

    public static final String[] branchName = new String[]{"CS","IS","EC","ME"}; 
    
    public static boolean contains(int[] array,int num) {
        for(int i=0;i<array.length;i++)
            if(array[i]==num)
                return true;
        return false;
    }
    
    public static boolean contains(String[] array,String branch) {
        for(int i=0;i<array.length;i++)
            if(array[i].equals(branch))
                return true;
        return false;
    } 

}
