// write an infinite loop using do while condition.

import java.util.Scanner;

public class L8psQS6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
    do {
        n+=sum;
        System.out.println(n);
    } while(n>1);
    }
}
