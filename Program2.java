import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 != 0) {
            System.out.println(num + " is an Odd number.");
        } else {
            System.out.println(num + " is NOT an Odd number.");
        }

        sc.close();
    }
}
