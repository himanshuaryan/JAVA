import java.util.*;

public class Main {
	public static void GCD(int a, int b){
	    
	    int[] s1 = new int[a];
	    int[] s2 = new int[b];
	    
	    int index1 = 0;
	    int index2 = 0;
	    
		for (int i = 1; i <= a; i++) {
	        if ((a%i) == 0) {
	            s1[index1] = i;
	            index1++;
	        }
		}
		
		System.out.print("\nDivisors of " + a + " are : ");
		for (int i = 0; i < s1.length; i++) {
		   if (s1[i] == 0) {
		       break;
		   }
		   System.out.print(s1[i] + ", ");
		}
		
	    for (int j = 1; j <= b; j++) {
	        if ((b%j) == 0) {
	            s2[index2] = j;
	            index2++;
	        }
	    }
	    
	    System.out.print("\nDivisors of " + b + " are : ");
	    for (int i = 0; i < s2.length; i++) {
	        if (s2[i] == 0) {
		       break;
		   }
		   System.out.print(s2[i] + ", ");
		}
		
	    int gcd = 0;
	    
	    for (int k = 0; k < s1.length; k++) { 
	        for (int m = 0; m < s2.length; m++) {
	            if (s1[k] == s2[m]) {
	                if (s1[k] == 0) {
	                    break;
	                }
	                gcd = s1[k];
	            }
	        }
	    }
	    
	    System.out.println("\n\nGreatest Common Divisor of " + a + " and " + b + " : " + gcd);
	}
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String again;
	    
	    do {
	        System.out.print("\nEnter first integer : ");
	        int n1 = sc.nextInt();
	        System.out.print("Enter second integer : ");
	        int n2 = sc.nextInt();
	        sc.nextLine();
	        
	        GCD(n1, n2);
	        
	        System.out.print("\nFind again (Yes/No) : ");
	        again = sc.nextLine();
	       
	    } while (again.equalsIgnoreCase("YES"));
	    System.out.print("Thank you for using JAVA GCD!")
	}
}