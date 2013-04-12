import java.math.BigInteger;
public class FibonacciCalculator 
{
	private static BigInteger TWO = BigInteger.valueOf(2);
	
	//recursive declaration of method fibonacci
	public static BigInteger fibonacci(BigInteger number)
	{
		//if(Fsub1 = 0  OR Fsub1 = 1)=> recurrence relation of Fibonacci sequence ; 
		//Fibonacci sequence has recurrence and two initial recurrence 
		//in mathmatics, recurrence relation is equation that RECURSIVELY defines a sequence 
		if(number.equals(BigInteger.ZERO)||number.equals(BigInteger.ONE))//base cases
		{
			return number;
		}
		else//recursion step
		{
			//Fn = Fsub(n-1) + Fsub(n-2)
			return fibonacci(number.subtract(BigInteger.ONE)).add(fibonacci(number.subtract(TWO)));
		}
	}//fibonacci
	public static void main(String [] args)
	{
		int counter = 0;
		//for(counter = 0; counter <= 40; counter++)
		while(counter != -1)
		{
			//if use this condition instead of for(), it will be infinite loop
			System.out.printf("Fibonacci of %d is %d\n",counter, fibonacci(BigInteger.valueOf(counter)));
			counter++;
		}
	}
	
}
