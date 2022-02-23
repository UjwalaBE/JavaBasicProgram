package oops.test;

public class AccessModifiers {
	
	private int a=10;
	
	private void display() {
		
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
		
		AccessModifiers am=new AccessModifiers();
		am.display();
		
		AccessModifiers sr=new Modify();
		
		sr.display();
		
		
		Modify mr=new Modify();
		
		mr.show();
		//mr.display();    //can not access

}
}