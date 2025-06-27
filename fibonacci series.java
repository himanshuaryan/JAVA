import java.util.*;

public class Main {
	public static void fibser(int a){
	    
	    int[] fibValues = new int[a];
	    
	    for (int x =0; x < 2; x++) {
	        fibValues[x] = x;
	    }
	    
	    int sum = 0;
	    
		for (int i = 0; i < a; i++) {
		    if (fibValues.length == (i+2)) {
		       break;
		    }
	        sum = fibValues[i] + fibValues[i+1];
	        fibValues[i+2] = sum;
		}
		
		System.out.print("\nFibonacci series of " + a + " are : \n");
		for (int j = 0; j < fibValues.length; j++) {
		   System.out.print(fibValues[j] + ", ");
		}
	}
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Welcome to find fibonacci series of nth number. Fibonacci of 0 and 1 is 0 and 1 respectively. So please enter number that will larger than 1.");
	    String again;
	    
	    do {
	        System.out.print("\nEnter the number : ");
	        int n1 = sc.nextInt();
	        sc.nextLine();
	        
	        fibser(n1);
	        
	        System.out.print("\n\nFind again (Yes/No) : ");
	        again = sc.nextLine();
	       
	    } while (again.equalsIgnoreCase("YES"));
	    System.out.print("\nThank you for using JAVA Fibonacci Series!");
	}
}