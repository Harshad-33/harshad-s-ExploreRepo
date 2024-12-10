import java.util.*;

public class L8psQS2 {
    public static void printSumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {// i+=2 is logic for odd num
            sum += i;
        }
        System.out.println("Sum of odd numbers up to " + n + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n : ");
        int n = sc.nextInt();
        printSumOfOddNumbers(n);
    }
}  