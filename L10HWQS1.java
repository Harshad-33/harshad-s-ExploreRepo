// import java.util.Scanner;
//take an array of name as input from the user and print them on the screen.
 public class L10HWQS1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter size : ");
//         int size = sc.nextInt();
//         String names[] = new String[size];//array
//         //input
//         for(int i=0;i<size;i++){
//             System.out.print("enter string : ");
//             names[i] = sc.nextLine();
//         }
//         //output
//         for(int i=0;i<names.length;i++){
//             System.out.println("name"+(i+1)+" "+"is : "+names[i]);
//         }
//     }
// }



// //Find the maximum & minimum number in an array of integers.
//public class L10HWQS1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter size : ");
//         int size = sc.nextInt();
//         int numbers[] = new int[size];
//         for(int i=0 ; i<size;i++){
//             System.out.print("enter numbers : ");
//             numbers[i] = sc.nextInt();
//         }
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         for(int i=0 ; i<numbers.length;i++){
//             if(numbers[i]< min){
//                 min = numbers[i];
//             }
//             if(numbers[i] > max){
//                 max = numbers[i];
//             }
//         }
//         System.out.println("largest number is max : "+max);
//         System.out.println("smallest number is min : "+min);
//     }


// public static void subarray(int arr[]){
//     for(int i=0;i<arr.length;i++){
//         int start = i;
//         for(int j=i;j<arr.length;j++){
//             int end = j;
//             for(int k=start;k<=end;k++){
//                 System.out.print(arr[k]+ " ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
// }
// public static void main(String[] args) {
//     int arr[]= {2,4,6,8,10};
//     subarray(arr);
// }


// public static void subarraysum(int number[]){
//     int currsum = 0;
//     int maxSum = Integer.MIN_VALUE;
//     for(int i=0;i<number.length;i++){
//         int start =i;
//         for(int j=i;j<number.length;j++){
//             int end =j;
//             currsum =0;
//             for(int k =start ;k<=end;k++){
//                 currsum += number[k];
//             }
//             if(maxSum < currsum){
//                 maxSum = currsum;
//             }
//         }
//     }
//     System.out.println("maxsum : "+maxSum);
// }
// public static void main(String[] args) {
//     int number[] = {2,4,6,8,10};
//     subarraysum(number);
// }

}