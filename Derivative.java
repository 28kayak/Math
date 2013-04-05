import java.util.Scanner;
public class Derivative
{
	double h;
	
	 public static double f(double x)
	{
		return (x * x);
	}
	 
	 
	 
	 public static void main(String [] args)
	 {
		 Scanner scan  = new Scanner(System.in);
		 double dydx = 0;
		 double x = 0.0;
		 double h = 1;
		 System.out.println("type x");
		 x = scan.nextDouble();
		 for(int i = 0; i < 1000; i++)
		 {
			 dydx = (f(x+h) + f(x)) / Math.pow(h, -i );
			 System.out.println(dydx);
			 
		 }
		
		 System.out.println(dydx);
		 
		 
	 }
}
