package aspire;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
      //INPUT
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Please enter a number.......:");
	  int num1=scan.nextInt();//this line will accept a input from the keyboard
	  
	  System.out.println("Please enter another number.........:");
	  int num2=scan.nextInt();//this line will accept another input from the keyboard
	  
	  int sum=num1+num2;//PROCESS of addition
	  
	  System.out.println("The sum of two number given is......."+sum);//output
	  
      }
}
