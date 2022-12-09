import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.File;
public class try_catch_throws {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReadAndWrite raw =new ReadAndWrite();
try {

	raw.savefile();
} 
catch (FileNotFoundException e) 
{
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	raw.readfile();
	
} 
catch (FileNotFoundException e)
{
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
	}
}
class ReadAndWrite{
	void readfile() throws FileNotFoundException
	{
	FileInputStream fis=new FileInputStream("E:/xyz.txt");
	
	}
	void savefile() throws FileNotFoundException
	{
		FileOutputStream fos=new FileOutputStream ("E:xyz.txt");
		
	}
	
}