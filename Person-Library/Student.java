abstract class Student extends Person {
  private int StudentNumber;

  public Student(int newStudentNumber, String newName) {
    super(newName);
    this.StudentNumber = newStudentNumber;
  }

  public int getStudentNumber(int newStudentNumber) {
    return this.StudentNumber;
  }

  public void setStudentNumber(int newStudentNumber) {
    this.StudentNumber = newStudentNumber;
  }

  public boolean isEligibleToEnroll() {
    return true;
  }

  public void work() {
    System.out.println("Studying...");
  }
}
