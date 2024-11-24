package DefaultMethods;

public interface Company2 
{
 default void Salary(int a, int b)
 {
  System.out.println(a-b);
 }
}
