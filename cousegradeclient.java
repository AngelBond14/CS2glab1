class Main
{
  public static void main(String[] args)
  {
    CourseGrade APCS = new CourseGrade("Computer Science", 'A');
    CourseGrade C2 = new CourseGrade("Coding II", 'B');
    APCS.setName("AP Computer Science");
    C2.setGrade('A');
    System.out.println(APCS.getName());
    System.out.println(C2.getGrade());
    System.out.println(C2.toString());
    System.out.println(APCS.equals(C2));
  }
}
