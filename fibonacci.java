import java.util.Scanner;

public class Fibonacci {
    public static void generateFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else if (n == 1) {
            System.out.println("Fibonacci Series: 0");
        } else {
            int first = 0, second = 1;
            System.out.print("Fibonacci Series: " + first + ", " + second);
            for (int i = 2; i < n; i++) {
                int next = first + second;
                System.out.print(", " + next);
                first = second;
                second = next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        generateFibonacci(n);
        scanner.close();
    }
}
