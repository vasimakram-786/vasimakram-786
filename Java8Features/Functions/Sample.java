package Functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Sample 
{
 public static void main(String[] args) 
 { 
	//Functions
	Function<String, Integer> f = name -> name.length();
	System.out.println(f.apply("KyybaTech"));
	System.out.println(" ");
	
	//forEach
	List<Integer> values = Arrays.asList(10,26,31,44,57,62);
	System.out.println(values);
	//External Looping
	for(Integer no:values)
		System.out.println(no);
	System.out.println(" ");
	
	//Internal Looping
	values.forEach(elem -> System.out.println(elem));
 }

}
