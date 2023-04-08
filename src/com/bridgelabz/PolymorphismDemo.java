package com.bridgelabz;


class Parent{

	  void add(int a , int b)
	  {
		  System.out.println("Parent class first add method that sum is : "+(a+b));
	  }
	  void add(int a, int b , int c){
		 
		 System.out.println("Parent class Second add method that sum is : "+ (a+b+c));
	  }
	  

	}
 class Child extends Parent{
		
		void add (int a , int b)
		{
			System.out.println("Child class add method and sum is :"+(a+b));	
		}
	
		
	}
public class PolymorphismDemo {

	public static void main(String[] args)
	{
		Parent parent1 = new Parent();
		Child child = new Child();
		Parent parent2 = new Child();
		
		/*
		 * Since Compiler works on type so parent class add method will be called and we
		 * will achieve compile time polymorphism or static polymorphism
		 */
		
		parent1.add(10, 20);
		parent1.add(10,20,30);
		
		//run time or Dynamic Polymorphism 
		
		parent1.add(30,40);  // parent class method will be called 
		parent2.add(20,30);  // child class method will be called because parent2 is holding clild class object
		                     //   and hense we achived polymorphism same method call showing different behaviour at run time 
		
		
	}
}
