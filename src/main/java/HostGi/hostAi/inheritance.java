package HostGi.hostAi;

public class inheritance 
{
	static int a,b,c,d;

	public static void main(String[] args) {
		a=10;
		b=20;
		c=30;
		Allsum lalit =new Allsum();
		//lalit.su();
		lalit.suk();
		
		

	}
}
class sum extends inheritance
{
	void su() {
	c=a+b;
	 System.out.println(c);  
	
	}
	
}
class Allsum extends sum
{
void suk()
{
d=c+a;
System.out.println(d);  
}
}
