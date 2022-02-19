package prog.test;

public class InsetionArray {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a= {10,20,30,40};
		int[] b= {50,60,80};
		int arr=a.length;
		int brr = b.length;
		
		int crr=arr + brr;
		int[] c=new int[crr];
		 for (int i = 0; i < arr; i++) {
			 
			 c[i] =a[i];
			 
			
		}
		 
		 for (int i = 0; i < brr; i++) {
			 c[arr+i]=b[i];
			
		}
		 
		 for(int i=0;i<c.length; i++)  {
			 
			 System.out.print(c[i]+" ");
		
		 }
		 
	

	}

		
	}

}
