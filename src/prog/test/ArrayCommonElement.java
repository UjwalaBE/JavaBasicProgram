package prog.test;

public class ArrayCommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] a = {10,20,30,40,50};
		int[] b= {40,50,60,70,80};
		 for (int i = 0; i < a.length; i++) {
			 for (int j = 0; j < b.length; j++) {
				 if (a[i]==b[j]) {
					 System.out.print(a[i]+" ");//printing common element
					
				}
				
			}
			 
			
		}

		
		
	}
	
	
	

}
