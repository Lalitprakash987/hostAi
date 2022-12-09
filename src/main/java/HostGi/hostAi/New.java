package HostGi.hostAi;
import java.util.Arrays;
public class New {
public static void main(String args[]) {
int []a= {9,6,8,2,4,3,1,5,7,11,12};
int temp;
for(int i=0; i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) { 
		
		if(a[i]<a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			
		}
	}
}
	

System.out.println("second largest number  " +a[1]);		
System.out.println(Arrays.toString(a));

}
	
}