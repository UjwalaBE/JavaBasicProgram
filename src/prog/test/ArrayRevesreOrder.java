package prog.test;

public class ArrayRevesreOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {10,20,30,40,50};
		int[] b =new int[5];
		
		
		for (int i = 0; i < a.length; i++) {
			
			
			b[i] =a[a.length-1-i];
			
			
			
			
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
			
		}

		
		
		
		
	}

}
