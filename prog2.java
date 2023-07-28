package prg2;


class Circle 
{
	double radius ;
	String  colour ; 
	 
	 
	
	Circle(double radius )
	{
		this.radius = radius ;
		this.colour = "red";
	}
	
	Circle(double radius , String color )
	{
		this.radius = radius ;
		this.colour = color;
	}
	
	String getColour()
	{
		return colour ;
	}
	
	double getRadius()
	{
		return radius ;
	}
	double getArea()
	{
		return Math.PI * radius *radius  ;
	}
}
class cylinder extends Circle 
{
	double height ;
	
	double getHeight()
	{
		return height  ;
		
	}
	
	double getVolume()
	{
		return  getArea()*height ; 
				
		
	}
	@Override 
	double getArea()
	{
		return 2* Math.PI*getRadius() *height  + 2 * super.getArea()  ;
		
	}
	
	public cylinder(double radius ,double height)
	{
		super(radius); // invoke the constructor present in the parent class
		this.height = height;
		
	}
	
	public cylinder(double radius ,double height,String color)
	{
		super(radius, color);
		this.height = height;
	}
	

	
	
	
}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinder C1 = new cylinder(5.0,2.0,"RED");
		cylinder C2 = new cylinder(5.0,1.0,"RED");
		
		if(C1.getVolume()==C2.getVolume()&& C1.getArea() == C2.getArea() && C1.getColour(). equals(C2.getColour()))
		{
			System.out.print("the cylinders are simlar");
		}
		else 
		{
			System.out.print("they are not similar ");
		}
				
	}

}
