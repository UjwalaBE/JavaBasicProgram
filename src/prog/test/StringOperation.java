package prog.test;

import java.util.Arrays;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
String s1= new String("deep is good");
		
		String s2="pooja is nice";
		
		System.out.println(s2.length());           //length of string
		
		System.out.println(s2.replace("is", "was"));//Replace string
		
		System.out.println(s1.charAt(0));//finding character at given index
		
		System.out.println(s1.concat(s2)); //concat
		
		System.out.println(s1);
		
		System.out.println(s2.concat(s1));
		
		System.out.println(s2);
		
	//*************************************************************************************	
		
		String str="ujjwal-bachche";
		
		String s[]=str.split("-");
		
	
		
		System.out.println(Arrays.toString(s));
		
		
		StringBuffer sb=new StringBuffer("ujjwalrag");
		
		 System.out.println(sb.append("raj"));
		 
		sb.trimToSize();
		 System.out.println(sb.capacity());
		 
		 
		 String ss="e";
		 String sn="A";
		 
		 System.out.println(ss.compareToIgnoreCase(sn));
		     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
