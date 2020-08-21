abstract class Professor extends Person {
  private float Salary;

  public Professor(String newName) {
    super(newName);
  }

  public float getSalary() {
    return this.Salary;
  }

  public void setSalary(float newSalary) {
    this.Salary = newSalary;
  }

  public void work() {
    System.out.println("Working...");
  }
}
