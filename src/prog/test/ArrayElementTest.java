package prog.test;

import java.util.Scanner;

public class ArrayElementTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

           int[] a= {1,2,3,4,5};
           int c=5;
		boolean flag=false;

		for (int i = 0; i < a.length; i++) {
			
			if (c==a[i]) {
				flag=true;
				break;
				
				
				
			}
		}
				
	    if(flag) {
	    	System.out.println("Element is present");;
	    }
	    else {
	    	System.out.println("Element is not  present");
	    }
	    }
		
	
		
	
	}


