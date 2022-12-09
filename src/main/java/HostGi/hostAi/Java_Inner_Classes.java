package HostGi.hostAi;

public class Java_Inner_Classes {

	public static void main(String[] args) {
	
		abc n=new abc();
		abc.def h=n.new def();
		System.out.println(n.a +" "+h.b);
		
	}
}
class abc //outer class
{ int a=10;
	class def      //inner class  (ager inner class private hogi to ham use call nahi kar sakte )
	{               //inner class static hogi to call ho jayegi 
	
int b=20;

		}
	}
	
