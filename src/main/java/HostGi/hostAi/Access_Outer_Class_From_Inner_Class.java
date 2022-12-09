package HostGi.hostAi;

public class Access_Outer_Class_From_Inner_Class {

	public static void main(String[] args) {
		a obj=new a();
		a.b ji=obj.new b();
		ji.c();
	System.out.println(ji.c());
	}

}
class a
{
	int a=10;
class b
{
public	int c()
	{
	return a;
	}
}	
}