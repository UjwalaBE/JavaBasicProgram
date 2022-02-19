package prog.test;

import java.util.Scanner;

public class LargestAmongthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any three numbers: ");
		int num1=in.nextInt();
		int num2=in.nextInt();
		int num3 =in.nextInt();
		
		  if( num1 >= num2 && num1 >= num3)
	          System.out.println(num1+" is the largest Number");

	      else if (num2 >= num1 && num2 >= num3)
	          System.out.println(num2+" is the largest Number");

	      else
	          System.out.println(num3+" is the largest Number");



	}

}
