package designpattern;

interface Shape
{
	void draw();//public ,abstract
}
class Circle implements Shape
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("In circle classb : draw()");
		
	}
	
}


class Rectangle implements Shape
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("In rectangle class : draw()");
		
	}
	
}

class Square implements Shape
{


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("In square class : draw()");
		
		
	}
	
	class ShapeFactory
	{
		public Shape getShape(String shapeType)
		{
			if(shapeType== null)
			{
			return null;
			}
			if(shapeType.equalsIgnoreCase("Circle"));
			    return new Circle();
			else if(shapeType.equalsIgnoreCase("Rectangle"))
				return new Rectangle();
			else if(shapeType.equalsIgnoreCase("Square"))
					return new Square();
			
			return null;
		}
	}
	

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ShapeFactory shapeFactoy = new ShapeFactory();
		
		
		//get an obj of circle and call its draw()

		Shape shape1 = shapeFactory .getShape("Circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory .getShape("Rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory .getShape("Square");
		shape3.draw();
	}

}
}
