import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        String type1 = (num1 % 2 == 0) ? "Even" : "Odd";
        String type2 = (num2 % 2 == 0) ? "Even" : "Odd";
        int sum = num1 + num2;

        System.out.println(num1 + " is " + type1 + ".");
        System.out.println(num2 + " is " + type2 + ".");
        System.out.println("Sum of the two numbers = " + sum);

        sc.close();
    }
}
