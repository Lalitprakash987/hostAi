package HostGi.hostAi;



	
		// TODO Auto-generated method stub
//		Method overloading is performed within class.	
//		Method overriding occurs in two classes that have IS-A (inheritance) relationship.
//		In case of method overloading, parameter must be different.	
//		In case of method overriding, parameter must be same.
//		In java, method overloading can't be performed by changing return type of the method only
		//. Return type can be same or different in method overloading. But you must have to change the parameter.
		//Return type must be same or covariant in method overriding.
		
		
		
public class ML_MR {
		
		static int add(int a,int b)
		{
			return a+b;
			}  
		static int add(int a,int b,int c)
		{
			return a+b+c;
			}  
		 
		//class TestOverloading1{  
		public static void main(String[] args){  
		System.out.println(ML_MR.add(11,11));  
		System.out.println(ML_MR.add(11,11,11));  
		
		
	}

}
