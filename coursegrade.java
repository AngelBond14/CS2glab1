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
		_letter = "";
	}

	// Overloaded "Set" Constructor
	public courseGrade(double g)
	{
		setCourseGrade(g)
	}
	public Letter(string l)
	{
		setLetter(l)
	}

	// Accessor Methods - "get" return the value of an Instance variable

	public  double getCourseGrade(  )
	{
		return _grade;
	}
	public string getLetter()
	{
		return _letter;
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
		return "courseGrade: The grade is " + _letter +" in " + _grade;
	}

	public boolean equals( courseGrade right )
	{
			if (this._grade == right._grade)
					return true;
			else
					return false;
	}
	public boolean equals( Letter right )
	{
			if (this._letter == right._letter)
					return true;
			else
					return false;
	}

}
