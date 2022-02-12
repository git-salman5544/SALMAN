package aspire;

public class JAVAPROGRAM22 {
public static void main(String[] args) {
	int i=0;
	int num =0;
	//Empty String
	String PrimeNumbers = "";
	
	for (i = 1; i <= 100; i++)
	{
		int counter=0;
		for(num =i; num>=1; num--)
		{
			if(i%num==0)
			{
				counter = counter + 1;
			}
			if(counter ==2)
			{
				//Appended the Prime Number to the String
				PrimeNumbers = PrimeNumbers + i + " ";
			}
		}
			System.out.println("Prime Numbers from 1 to 100 are :");
			System.out.println(PrimeNumbers);
	}
}
}

