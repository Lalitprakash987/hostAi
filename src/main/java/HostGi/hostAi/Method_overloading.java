package HostGi.hostAi;
 
public class Method_overloading {
	

	static void sum(int a,long b)
	  {System.out.println(a+b);
	  }  
	static void sum(int a,float c,int e)
	  {
	 System.out.println(a+c+e);
		  } 
	static void foo()
	{
		System.out.println("Hello good morning bro");
	}
static void foo(int a)
{
	System.out.println("Hellogood night " + a+ " brother ");
	}
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		foo();
		foo(200);
		sum(10,20);
		sum(10,2,87);
		
		
		
		 
			  
			
	}
	
	}


