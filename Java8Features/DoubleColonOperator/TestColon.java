package DoubleColonOperator;

@FunctionalInterface
interface Interface
{
 public int maximum(int a, int b);
}

public class TestColon
{
 public static int Max(int a, int b)
 {
   return Math.max(a, b);
 }
 
 public int Min(int a, int b)
 {
	 return Math.min(a, b);
 }
}