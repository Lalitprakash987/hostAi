import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class Arrays_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {11,22,3,0,7,9,4,5};
		//Arrays.sort(a);
		//Collections.reverseOrder(a);
		 Arrays.sort(a, Collections.reverseOrder());
		//reverse(a);
		System.out.println(Arrays.toString(a));

		//System.out.println(a[3] );

	}

}
