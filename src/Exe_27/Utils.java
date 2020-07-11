package Exe_27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Utils {
	
	public static final List<String> designList = (List<String>) Arrays.asList("Developer","Tester","Lead","Manager");
	public static final HashSet<String> designationSet = new HashSet<String>(designList);
	
	public static final List<String> deptList = (List<String>) Arrays.asList("TTH","RCM","Digital","DevOps");
	public static final HashSet<String> deptSet = new HashSet<String>(deptList);

}
