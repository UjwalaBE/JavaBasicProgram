package oops.test;

import prog.test.PublicExtend;

public class PublicModifier {
	
	

	public int a=10;
	
	public void display() {
		
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
		
		PublicModifier am=new PublicModifier();
		am.display();
		
		PublicModifier sr=new PublicMod();
		
		sr.display();
		
		
		PublicModifier mr=new PublicExtend();
		
	//	mr.shown();
		mr.display(); 
		
		PublicExtend pe=new PublicExtend();
		pe.shown();
		pe.display();
		

}

}
