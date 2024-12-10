import java.util.*;

public class L8psQS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 num: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1+num2+num3;
        int avg = sum / 3;
        System.out.println( "avg is: "+avg);
    }
}