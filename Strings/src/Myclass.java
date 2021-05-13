

class Rectangle {
double length;
double breadth; 

public Rectangle(double length, double breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}
//Rectangle(double length,double breadth ) {
//	this.length=length;
//	this.breadth=breadth;
//	

double getArea() {
	return length*breadth;
}
double getPerimeter() {
	return 2*(length+breadth);
}
}
public class Myclass {
  public static void main(String[] args) {
  Rectangle r=new Rectangle(10.0,20.0);
  System.out.println(r.getArea());
  System.out.println(r.getPerimeter());
}
}
