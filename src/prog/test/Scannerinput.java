package prog.test;

import java.util.Scanner;

public class Scannerinput {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter name");
		 
		String name=s.next();
		
		System.out.println("Enter a,b");
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a+b;
		
		System.out.println(c);
	
		
		
		
		
		System.out.println("Enter ph");
		
		long ph=s.nextLong();
		
		System.out.println("Enter gender");
		
		char gender =s.next().charAt(0);
		
		
		
		
		
	}

}
