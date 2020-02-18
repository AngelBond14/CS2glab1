// CS2511 Chapter 7 Group Lab
// Group 3: Antonio Codignotto, Shijo Thomas, Kevin Jaimon

public class courseGrade 		// Class Declaration
{
	// Instance Variables (Data)
	private double _grade;

	// Methods (Actions)
	// Constructors  Initialize all instance variables

	// Default Constructor
	public courseGrade()
	{
		_grade = 0;
	}

	// Overloaded "Set" Constructor
	public courseGrade(double g)
	{
		setCourseGrade(g);

	}

	// Accessor Methods - "get" return the value of an Instance variable

	public  double getCourseGrade(  )
	{
		return _grade;
	}

	// Mutator Methods - "set" change the value of an Instance variable

	public void setCourseGrade( double g )
	{
		if (g >= 0)
			_grade = g;
		else
			_grade = 0;
	}

	public String toString( )
        {
		return "courseGrade: The grade is " + _grade;
	}

	public boolean equals( courseGrade right )
	{
			if (this._grade == right._grade)
					return true;
			else
					return false;
	}

}
