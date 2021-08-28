package week3.day2;

import java.awt.List;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingByCollection {

	public static void main(String[] args) {
		ArrayList<String> companyname=new ArrayList<String>();
		
		companyname.add("aspire system");
		companyname.add("wipro");
		companyname.add("Hcl");
		companyname.add("cts");
		int companysize = companyname.size();
		System.out.println("length ofthe array):"+ companysize);
		
		Collections.sort(companyname);
		
		System.out.println("Sorted arraylist+ companyname");
		
		 
	
		 for (int i=(companyname.size()-1); i>=0; i--) { 
			  System.out.print(companyname.get(i)+" ");
	
		 }
	
}
}
