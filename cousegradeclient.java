// Needs to be refomatted for coursegrade

public class CircleClient
{
	public static void main(String [] args)
	{
		Circle c1;

		// test constructors
		c1 = new Circle();

		Circle c2 = new Circle(4.0);

		// test accessor
		double y = c2.getRadius();

		System.out.println("The radius of c2 is " + y);

		// test mutator
		c1.setRadius(3.0);

		System.out.println("The radius of c1 is " + c1.getRadius());

		// test toString()
		// explicit call
		System.out.println(c1.toString());
		// implicit call
		System.out.println(c2);

		if (c1.equals(c2))
				System.out.println("Hi");
		else
				System.out.println("Bye");

		System.out.println("The diameter of c1 is " + c1.calcDiameter());
		System.out.println("The area of c1 is " + c1.calcArea());


	}
}
