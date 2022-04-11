	import java.util.Scanner;
	
public class PayMoney {
	
	public static void main (String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of transaction Array");
		int array=sc.nextInt();
		int []arr =new int [array];
		int i;
		
		System.out.println(" Enter the values of transaction Array");
		for  ( i=0; i<array;i++) {
			arr [i] = sc.nextInt();
		}
		System.out.println ("Enter the total number of targets to be achieved");
		 int targetno = sc.nextInt();
		 
		 while (targetno-- !=0) {
		
			 int flag =0;
			 long target;
			System.out.println("enter the value of target");
		 
		target = sc.nextInt();
		
		long sum = 0;
		
		 for ( i=0; i<array;i++) {
			 sum = sum + arr[i];
			 
			 if(sum>= target) {
				 System.out.println("Target achevied after"+ (i+1)+ "transaction");
				 flag =1;
				 break; 
				 
			 }
		 }
		 
		 if (flag == 0) {
			 System.out.println("Given target is not achieved");
		 }
			
		 }	
	}		
}		
	


