package HostGi.hostAi;

public class static_non_static 
{
	int a=10;
	static int b=20;
	public static void main(String[] args) 
	{
		static_non_static abc =new static_non_static();
		static_non_static.lalit();
		abc.prakash();
		
	}	
		static void lalit()
		{
			System.out.println(b);	
		}
		
		void prakash()
		{
			System.out.println(a+" "+b);
	}
}
