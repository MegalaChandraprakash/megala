package week3.day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class FindIntersection {
	public static void main (String[]args) {
	int[] arrNum1 = { 3, 2, 11, 4, 6, 7 };
	int[] arrNum2 = { 1, 2, 8, 4, 9, 7 };
	List<Integer> List1 = new ArrayList<Integer>();
	List<Integer> List2 = new ArrayList<Integer>();
	for (Integer i : arrNum1){
	
	    List1.add(i);
	}
	for(Integer j : arrNum2) {

		List2.add(j);
	}
	List1.retainAll(List2);
	System.out.println("intersection value of both arrays are:"+List1);
	
	}
}

	// TODO Auto-generated method stub
	
		