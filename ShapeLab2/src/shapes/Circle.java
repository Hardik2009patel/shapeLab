package shapes;

public class Circle 
{
	private double circumference;
	private double area;
	private double radius;
		  public Circle  (double c, double a, double r)
	  {
		 
		circumference  = c;
		  area = a;
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
