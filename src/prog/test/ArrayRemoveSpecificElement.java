package prog.test;

public class ArrayRemoveSpecificElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {10,20,30,40,50};
		 int b= 20;//Removing 20 from Array
		  for (int i = 0; i < a.length; i++) {
			  
			  if (b==a[i]) {
				  
				  for (int j = i; j < a.length-1; j++) {
					  a[j]=a[j+1];
					  
					
				}
				  
				break;  
				
			}
			
		}
		  //Reprinting array
		for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i]+" ");
			
		}


		
		
	}

}
