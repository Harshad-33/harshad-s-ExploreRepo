import java.util.Scanner;

public class L8psQS4 {
    public static void circumferenceOfCircle(int r) {
        float circumference = 2 * 3.14f * r; // Use 'f' to denote float constant
        System.out.println(circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enterr radius : ");
        int n = sc.nextInt();
        circumferenceOfCircle(n);
    }
}
