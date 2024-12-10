import java.util.Scanner;

public class L8psQS5 {
    public static void printAge(int age){
        if(age>=18){
            System.out.print("person is eligible to vote");
        }else{
            System.out.println("person is not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age : ");
        int age = sc.nextInt();
        printAge(age);
    }
}
