import java.util.*;

public class L8psQS3 {
    public static void printGrater(int a , int b){
        if (a<b) {
            System.out.println(b + "is greater");
        }else{
            System.out.println(a +"is lagest");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enterr values of a & b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        printGrater(a, b);
    }
}
