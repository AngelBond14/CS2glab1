 private String name = "";
  private char grade = ' ';
  
  public CourseGrade(String courseName, char letterGrade) {
    name = courseName;
    grade = letterGrade;
  }
  
  public void setName(String newName) {
    name = newName;
  }
  
  public void setGrade(char newGrade) {
    grade = newGrade;
  }
  
  public String getName() {
    return name;
  }
  
  public char getGrade() {
    return grade;
  }
  
  public boolean equals(String other) {
    return toString() == other.toString();
  }
  
  public String toString() {
    return "Course Name: " + name + ", Letter Grade: " + grade;
  }
