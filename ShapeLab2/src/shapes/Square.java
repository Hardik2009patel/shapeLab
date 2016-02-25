package shapes;

public class Square implements Shape{
	double length;
	double width;
	
public Square(double length, double width){
		this.length = length;
		this.width = width;
	}
	
public double getPerimeter(){
		return length * 4;
	}
	
public double getArea(){
		return length * width;
	}
}
