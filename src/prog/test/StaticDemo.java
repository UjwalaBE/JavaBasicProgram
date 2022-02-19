package prog.test;

public class StaticDemo {
	
	
	 static int i=10,l=20;
	 
	 int k=30,m=40;
	static void display() {
		System.out.println(i);
		
	}
	
	static void display1() {
		System.out.println(l);
		System.out.println(m);//instance variable not accessed by static methods
		
		show();               //instance method can not call in static methods
	}
		
		
	

	
	void show() {
		System.out.println(i); 
		System.out.println(k);//both instance and static variable accessed by instance methods
		display();              //static methods can call in instance method
	}
	
	void show1() {
		System.out.println(l);
		System.out.println(m);
		display1();    
	}
	
 

	public static void main(String[] args) {
		StaticDemo.display(); // static method can call without crating object
		StaticDemo.display1();
		StaticDemo d =new StaticDemo(); // we need to crate object for instance method
		d.show();
		d.show1();
	
		
		
	}



}
