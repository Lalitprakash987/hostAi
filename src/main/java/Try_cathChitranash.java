import java.util.Scanner;
public class Try_cathChitranash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {22,33,44,55,66};
		Scanner ac= new Scanner(System.in);
		
		System.out.println("enter index from 1-4");
		int b =ac.nextInt();
		try
		{
			System.out.println(arr[b]);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.toString());
			e.printStackTrace();
			
		}
		ac.close();
		}
	}


