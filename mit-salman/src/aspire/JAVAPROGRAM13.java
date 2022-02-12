package aspire;
import java.util.Scanner;

public class JAVAPROGRAM13 {
public static void main(String[] args) {
	int number, sum=0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("n Please Enter any integer Value below 10; ");
	number = sc.nextInt();
	
	while(number<=10) {
		sum=sum + number;
		number++;
	}
	System.out.format(" Sum of the Number From the While Loop is: %d" ,sum);
}
}
