package prog.test;

public class ArraySecondLargestNo {

	public static void main(String[] args) {
		
		
		int[] a= {6,8,5,9,12,4};
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
				
			}
			if (i==1) {
				System.out.println(a[i]);
				break;
				
			}

		
		
		
	}

	}
}
