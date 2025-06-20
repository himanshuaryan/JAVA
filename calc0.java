import java.util.*;

public class Main {
    public static int csum (int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static int csub (int a, int b) {
        int sub = a - b;
        return sub;
    }
    public static int cmul (int a, int b) {
        int mul = a * b;
        return mul;
    }
    public static int cdiv (int a, int b) {
        int div = a / b;
        return div;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Good morning, " + name + "!\nWelcome to JAVA calculator");
        System.out.print("\nEnter first integer : " );
        int a = sc.nextInt();
        System.out.print("Enter second integer : ");
        int b = sc.nextInt();
        System.out.println("\nOPERATIONS :-\n 1. ADDITION\n 2. SUBTRACTION\n 3. MULTIPLICATION\n 4. DIVISION\n");
        System.out.print("Select an operation above mentioned(1,2, etc) : ");
        int sel = sc.nextInt();
        if (sel == 1) {
            System.out.println("Addition of first & second integer : " + csum(a,b));
        } else if(sel == 2) {
            System.out.println("Subtraction of first & second integer : " + csub(a,b));
        } else if(sel == 3) {
            System.out.println("Multiplication of fisrt & second integer : " + cmul(a,b));
        } else if(sel == 4) {
            if (b == 0){
                System.out.println("Second integer can't be zero.");
                return;
            } else {
                System.out.println("Division of first by second integer : " + cdiv(a,b));
            }
        } else {
            System.out.println("Invalid input!");
        }
    }
    
}
