package LamdaExpressions;

import java.util.Scanner; 

@FunctionalInterface
public interface Admin 
{
 public void User1();
 
 public static void SimpleCalci()
 {
	int n1,n2,Add,Sub,Mul,Div;
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter First Number:");
	 n1 = sc.nextInt();
	 System.out.print("Enter Second Number:");
	 n2 = sc.nextInt();	 
	 System.out.print("\n");
	 
	 Add = n1+n2;
	 System.out.println("Addition :"+Add);
	 
	 Sub = n1-n2;
	 System.out.println("Subtraction :"+Sub);
	 
	 Mul = n1*n2;
	 System.out.println("Multiplication :"+Mul);
	 
	 Div = n1/n2;
	 System.out.println("Division :"+Div);
	 sc.close();
 }
}

