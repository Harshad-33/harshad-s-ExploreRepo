//2D arrays in java.

import java.util.Scanner;

public class L11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of rows: ");
        int rows = sc.nextInt();
        System.out.print("enter no of cols: ");
        int cols = sc.nextInt();
        int [][] numbers = new int [rows] [cols];
        System.out.print("enter matrix elements: ");
        //input
        //rows
        for(int i=0; i<rows ; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }

        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if (numbers[i][j]==x) {
                    System.out.println("x is found("+ i +","+ j +")");
                }
            }
        }
    }
}