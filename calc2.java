import java.util.*;

public class Main {
    public static int csum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static int csub(int a, int b) {
        int sub = a - b;
        return sub;
    }
    public static int cmul(int a, int b) {
        int mul = a * b;
        return mul;
    }
    public static int cdiv(int a, int b) {
        int div = a / b;
        return div;
    }
    public static void operation(int a, int b, int choice) {
        System.out.print("\n");
        switch (choice) {
            case 1:
                System.out.println("Addition of first & second integer : " + csum(a, b));
                break;
            case 2:
                System.out.println("Subtraction of first & second integer : " + csub(a, b));
                break;
            case 3:
                System.out.println("Multiplication of first & second integer : " + cmul(a, b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Second integer can't be zero.");
                } else {
                    System.out.println("Division of first by second integer : " + cdiv(a, b));
                }
                break;
            default:
                System.out.println("\nInvalid input!\nPlease select from 1 to 4.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Good morning, " + name + "!\nWelcome to JAVA calculator");
        while (true) {
            System.out.print("\nEnter first integer : ");
            int n1 = sc.nextInt();
            System.out.print("Enter second integer : ");
            int n2 = sc.nextInt();
            System.out.println("\nOPERATIONS :-\n 1. ADDITION\n 2. SUBTRACTION\n 3. MULTIPLICATION\n 4. DIVISION\n");
            System.out.print("Select an operation above mentioned(1,2, etc) : ");
            int choice = sc.nextInt();
            sc.nextLine();
            operation(n1, n2, choice);
            System.out.print("\nCalculate again (Yes/No)? ");
            String contCalc = sc.nextLine();
            if (contCalc.equalsIgnoreCase("NO")) {
                break;
            }
        }

        System.out.println("\nThank you for using the JAVA calculator, " + name + "!");
        sc.close();
    }
}
