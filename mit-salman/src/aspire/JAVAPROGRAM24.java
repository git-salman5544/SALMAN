package aspire;

public class JAVAPROGRAM24 {
public static void main(String[] args) {
	int[] array = {10, 20, 30, 40, 50, 10};
	int sum=0;
	//Advance for loop
	for(int num:array) {
		sum = sum+num;
	}
	System.out.println("Sum of array elements is:"+sum);
}
}
