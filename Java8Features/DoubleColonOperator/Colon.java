package DoubleColonOperator;

import java.util.ArrayList;

public class Colon 
{
  public static void main(String[] args) 
  {
	ArrayList<String> bikes = new ArrayList<String>();
	bikes.add("Himalayan");
	bikes.add("GT");
	bikes.add("Hunter");
	bikes.add("Meteor");
	bikes.add("Shotgun");
	bikes.add("Interceptor");
	
	bikes.forEach(System.out::println);
	
	System.out.println("--------Static Method--------");
	Interface inter = TestColon :: Max;
	System.out.println("Maximum :" + inter.maximum(50, 30));
	
	System.out.println("--------Instance Method--------");
	Interface inter1 = new TestColon() :: Min;
	System.out.println("Minimum :" + inter1.maximum(60, 130));
  }
}
