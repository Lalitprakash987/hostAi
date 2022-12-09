class UnderAgeException extends Exception
{
	UnderAgeException()
	{
super("you are under age");
} 
UnderAgeException(String message)
{
	super(message);
}
	
}
public class Customized_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age =17;
try {
if(age<18)
{
	throw new UnderAgeException();
	
	}
else
{
	System.out.println("you can vot now ");
	}
	}
catch (UnderAgeException e) {
	e.printStackTrace();
	}
	}
}
