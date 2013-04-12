
public class Vector
{	
	private int dementional;
	private int vector[]  = new int [dementional];
	/*
	private int x;
	private int y; 
	private int z;
	*/
	public Vector()
	{//initialize all components are 0 
		vector[0] = 0;
		vector[1] = 0;
		vector[3] = 0;
		
	}
	
	public Vector(int x, int y, int z )
	{
		vector[0] = x;
		vector[1] = y;
		vector[3] = z;
		
	}
	public void setX(int x)
	{
		vector[0] = x;
	}
	public void setY(int y)
	{
		vector[1] = y;
	}
	public void setZ(int z)
	{
		vector[3] = z;
	}
	public int getX()
	{
		return vector[0];
	}
	public int getY()
	{
		return vector[1];
	}
	public int getZ()
	{
		return vector[2];
	}
	public int[] scalarMultipication(int scalar)
	{
		Vector ans = new Vector();
		for(int component = 0; component < vector.length; component++)
		{
			ans.vector[component] = this.vector[component] * scalar;
		}
		
		return vector;
	}
	public double magnitude()
	{
		double magnitude = 0;
		
		return magnitude;
	}
	public double dodProdct(Vector v)
	{
		double scalar = 0.0;
		
		return scalar;
	}
	public Vector crossProdct(Vector v)
	{	
		Vector normalVector; 
		
		
		return normalVector;
	}
	public Vector add(Vector v)
	{
		
		return 
	}
	public Vector subtract(Vector v)
	{
		
		return 
	}
	public Vector unitVector()
	{
		Vector unit = new Vector();
		for(int i = 0; i < vector.length; i++)
		{
			unit.vector[i] =(int)(unit.vector[i] / this.magnitude());
			
		}
		return unit;
	}
}
