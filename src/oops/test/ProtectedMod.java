package oops.test;

import prog.test.ProtectedM;

public class ProtectedMod {
	
	
	

	protected int a=10;
	
	protected void display() {
		
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
		
		ProtectedMod am=new ProtectedMod();
		am.display();
		
		ProtectedMod sr=new ProtMod();
		
		sr.display();
		
		
		ProtectedMod mr= new ProtectedM();
		
		//mr.show();// can not acess
		mr.display();    //can  access

}

}
