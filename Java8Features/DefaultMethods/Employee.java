package DefaultMethods;

public class Employee implements Company1,Company2
{
  public static void main(String args[])
  {
	 Employee emp = new Employee();
	 emp.Salary(10, 5);
  }

@Override
public void Salary(int a, int b) 
{
	Company1.super.Salary(a, b);
	Company2.super.Salary(a, b);
}
}
