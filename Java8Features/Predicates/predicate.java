package Predicates;

import java.util.function.Predicate;

public class predicate 
{
 public static void main(String args[])
 {
	 System.out.print("Odd Or Even :");
	 Predicate<Integer> I = no -> no%2==0;
	 System.out.println(I.test(60));
	 
	 System.out.print("\nFind Length :");
	 Predicate<String> S = pwd -> pwd.length()>=8;
	 System.out.println(S.test("abc1234"));
	 
	 System.out.println("\nArray:");
	 int[] arr = {1,2,3,4,5,6,7,8,9,10};
	 Predicate<Integer> a = no -> no%2==0;
	 for(int i=0;i<arr.length;i++)
	 {
	 System.out.println(a.test(arr[i]));
	 }
}
}
