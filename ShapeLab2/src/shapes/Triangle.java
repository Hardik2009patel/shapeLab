package shapes;

public class Triangle 
{

    private double height;
    private double base;
    private double hypotenuse;
   public Triangle(double h, double b, double hy)
   {
       h= height;
       b = base;
       hy= hypotenuse;
   }

   public double getPerimeter()
   {
       double perimeter = height + base + hypotenuse;
       return perimeter;
   }

   public double getArea()
   {
       double area = (height * base) / 2;
       return area;
   }


   
}
