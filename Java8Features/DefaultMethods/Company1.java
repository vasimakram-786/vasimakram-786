package DefaultMethods;

public interface Company1 
{
 default void Salary(int a, int b)
 {
	 System.out.println(a+b);
 }
}
