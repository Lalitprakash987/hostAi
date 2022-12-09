package HostGi.hostAi;

public class Methods 
{
	String color;
	int a;
	
	
	public void Animal() 
	{
		System.out.println("My name is sia");
	}

	public static void main(String[] args) 
	{
		
		System.out.println("Hello");
		Methods dog=new Methods();
		Don dg=new Don();
		dog.Animal();
		dog.raw();
		dg.fly();
		dog.color="i am black";
		dog.a=20;
		System.out.println(dog.color+" "+ dog.a);
	}
	public void raw()
	{
		System.out.println("Hello brother ");
		
		
	}
	
}

class Don{
	
	void fly()
	{
	System.out.println("hello lalit how are you ");	
	}
}