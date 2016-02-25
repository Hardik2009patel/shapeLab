package shapes;

public class Circle 
{
	private double radius;
		  public Circle  (double r)
	  {
		  radius= r;  
	  }
	  
	  public double getCircumference( double rasdius)
	  {
		  return 2 * Math.PI * radius;
	  }
	  
	  public double getArea( double radius)
	  
	  {
		  return Math.PI * Math.pow(radius, 2);
	  }
	  

}
