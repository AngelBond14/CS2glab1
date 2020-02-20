// CS2511 Chapter 7 Group Lab
// Group 3: Antonio Codignotto, Shijo Thomas, Kevin Jaimon

public class courseGradeclient
{
  public static void main( String [] args )
  {
    System.out.println( "Before instantiating an courseGrade object:" + courseGrade.getGrade() + courseGrade.getCourse() );

    courseGrade cs = new courseGrade("CSII", "A");

    System.out.println( "\nAfter instantiating an courseGrade object:" + courseGrade.getGrade() + courseGrade.getCourse() );
  }
}
