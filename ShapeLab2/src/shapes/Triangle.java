package shapes;

public class Triangle 
{

    private double height;
    private double base;
    
   public Triangle(double h, double b)
   {
       h= height;
       b = base;
      
   }
  public double getHypotenuse()
   {
	   double hypotenuse=  Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));
	return hypotenuse;

	   
   }
   public double getPerimeter()
   {
       double perimeter = height + base + getHypotenuse ();
       return perimeter;
   }

   public double getArea()
   {
       double area = (height * base) / 2;
       return area;
   }

 
   
}
