//bubble sort (this is only for sorted array , because time complexity is O(n))
// public class L16sorting {
//     public static void printarray(int arr[]){
//         for (int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[]= {1,2,3,4,5};
//         //bubble sort [if you give unsorted array elements then this code is not work]
//             int swap =0;
//             for(int j=0;j<arr.length-swap-1;j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr [j+1]= temp;    
//                     swap++;     
//                 }
//             }
//             printarray(arr);
//             System.out.println("no of swap : "+swap);
//         }
//     }



//selection sort
// public class L16sorting {
//     public static void printarray(int arr[]){
//         for (int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[]={7,8,1,3,2};
//         //selection 
//         for(int i=0; i<arr.length-1; i++){
//             int smallest = i;
//             for(int j=i+1; j<arr.length;j++){
//                 if(arr[j]<arr[smallest]){
//                     smallest = j;
//                 }
//             }
//             //swap
//             int temp = arr[smallest];
//             arr[smallest]=arr[i];
//             arr[i]=temp;
//         }
//         printarray(arr);
//     }
// }



//insertion sort
// public class L16sorting {
//     public static void printarray(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[]= {7,8,1,3,2};
//         //insertion sort.
//         for(int i=1;i<arr.length;i++){
//             int current = arr[i];
//             int j=i-1;
//             while (j>=0 && arr[j]> current) {
//               //keep swapping
//               arr[j+1]= arr[j];
//               j--;  
//             }
//             arr[j+1]=current;
//         }
//         printarray(arr);
//     }
// }

