package Exe_21;

import java.util.HashSet;
import java.util.Set;

public class Utils {
	
	public static final Set<Integer> numberPositions = new HashSet<Integer>() {
		{
			add(0);
			add(3);
			add(4);
			add(7);
			add(8);
			add(9);
		}
	};
	
	public static final Set<Integer> characterPosiotions = new HashSet<Integer>() {
		{
			add(1);
			add(2);
			add(5);
			add(6);
		}
	};
	
	public static final Set<String> branchName = new HashSet<String>() {
		{
			add("CS");
			add("IS");
			add("EC");
			add("ME");
		}
	};

}
