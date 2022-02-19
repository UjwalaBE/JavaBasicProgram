package prog.test;

import java.util.Scanner;

public class GenderCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String gender;
	    Scanner scan = new Scanner(System.in);

	    System.out.println("What is your gender, male or female?");
	    gender = scan.nextLine();


	    if( gender.equals("f")||gender.equals("F")||gender.equals 
	       ("female")||gender.equals("Female")||gender.equals("FEMALE"))
	    {
	       System.out.println("A female" );
	    }

	    if( gender.equals("m")||gender.equals("M")||gender.equals         
	        ("male")||gender.equals("Male")||gender.equals("MALE"))
	    {
	       System.out.println("A male.");
	    }
	    
	    if( !(gender.equals("m")||gender.equals("M")||gender.equals         
		        ("male")||gender.equals("Male")||gender.equals("MALE")))
	    {
	    
	     System.out.println("wrong selection");

		

		
	}
	
	}    
}
