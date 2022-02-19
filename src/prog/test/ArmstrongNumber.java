package prog.test;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Ënter three digit Number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
		
		 int  number, temp, total = 0;

	        number = num;
	        while (number != 0)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp;
	            number /= 10;
	        }

	        if(total == num)
	            System.out.println(num + " is an Armstrong number");
	        else
	            System.out.println(num + " is not an Armstrong number");
	}

}
