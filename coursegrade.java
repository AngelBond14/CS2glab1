// CS2511 Chapter 7 Group Lab
// Group 3: Antonio Codignotto, Shijo Thomas, Kevin Jaimon

public class courseGrade 		// Class Declaration
{
	// Instance Variables (Data)
	private String grade; //grade for the course
	private String course; //Course name

//Constructors
	public courseGrade()
	{
		grade = "unkonwn"
		course = "unknown"
	}


	// Accessor Methods - "get" return the value of an Instance variable
	public String getGrade()
	{
		return course;
	}
	public String getCourse()
	{
		return grade;
	}
//Mutator
	public courseGrade setGrade(String grade)
	{
		this.grade = grade;
		return this;
	}
	public courseGrade setCourse(String course)
	{
		this.course = course;
		return this;
	}

//toString

	public String toString( )
        {
		return "Course Name: " + course + ", Grade : " + grade;
	}

}
