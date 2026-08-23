import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            int sum = num1 + num2;
            System.out.println("Both numbers are even. Sum = " + sum);
        } else {
            System.out.println("Both numbers are not even, so the even-sum rule does not apply.");
        }

        sc.close();
    }
}
