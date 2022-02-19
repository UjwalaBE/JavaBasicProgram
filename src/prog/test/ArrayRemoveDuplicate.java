package prog.test;

import java.util.HashSet;
import java.util.Set;

public class ArrayRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {10,20,30,20,40,30,50};
        Set<Integer> hs=new HashSet<>();
		 for (int i = 0; i < a.length; i++) {
			 
			 hs.add(a[i]);
			 
			
		}
		 
		 for (Integer no : hs) {
			 System.out.print(no+" ");
			
		}

		
		
		
		
		
	}

}
