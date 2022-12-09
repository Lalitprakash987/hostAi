package HostGi.hostAi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int []arr = {9,1,2,3};
    	int lowest = arr[0];
    	int secLowest = arr[0];
    	for (int i = 0; i < arr.length; i++) {
    	  if (arr[i] < lowest) {
    	    secLowest = lowest;
    	    lowest = arr[i];
    	  } else if (arr[i] < secLowest && arr[i] != secLowest) {
    	    secLowest = arr[i];
    	  }
    	}
    	System.out.println(secLowest);
}
}