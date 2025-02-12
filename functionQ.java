import java.util.Scanner;

public class functionQ {

    //question first
    public static int Average(int x , int y , int z){
        return (x+y+z)/3;
    }

    //question second
    public static boolean isEven(int num){
        if (num % 2 ==0) {
            return true;
        }else{
            return false;
        }
    }


    //question third
    public static boolean palindrome(int num){
        int palindrome = num;
        int rev = 0;
        while (palindrome != 0) {
            int rem = palindrome % 10;
            rev = rev * 10 + rem;
            palindrome = palindrome /10;
        }
        if(num == rev){
            return true;
        }else{
            return false;
        }
    }


    //question fifth
    public static int  sumofDigit(int num){
        int sum =0 ;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num = num /10;
        }
        return sum;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //question one 
        // System.out.println("enter 3 values : ");
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int z = sc.nextInt();
        // System.out.println(Average(x,y,z));


        //question second
        // System.out.println("enter num : ");
        // int num = sc.nextInt();
        // if(isEven(num)){
        //     System.out.println("numbeer is even ");
        // }else{
        //     System.out.println("num is odd");
        // }
        // System.out.println(isEven(num));


        //question third
        // System.out.print("enter num :");
        // int num = sc.nextInt();
        // System.out.println(palindrome(num));


        //question fifth
        // System.out.print("enter num : ");
        // int num = sc.nextInt();
        // System.out.println(sumofDigit(num));




    }
}
