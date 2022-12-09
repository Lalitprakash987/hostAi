import java.util.Scanner;
public class try_catch_chitransh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Enter the value1");
		
		Scanner sc=new Scanner(System.in);
		int i =sc.nextInt();
		int j=100/i;
		System.out.println(j);
	}
catch(ArithmeticException e)
{
	
	e.printStackTrace();
	
}
	}

}
