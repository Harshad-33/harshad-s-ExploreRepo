// Advance level recursion questions.

//Print all the permutations of a string.
// public class recursionADV {
//     public static void printperm(String str, String permutation){
//         if(str.length()==0){
//             System.out.println(permutation);
//             return;
//         }
//         for(int i = 0 ; i<str.length(); i++){
//             char currchar = str.charAt(i);
//             //"abc"-> "ab"
//             String newstr = str.substring(0, i)+str.substring(i+1);
//             printperm(newstr, permutation + currchar);
//         }
//     }
//     public static void main (String args[]){
//         String str = "abc";
//         printperm(str, "");
//     }
// }


//count total paths in a maza to move from (0,0) to (n,m)
// public class recursionADV {
//     public static int countpath(int i, int j, int n, int m){
//         if(i==n || j== m){
//             return 0;
//         }
//         if(i==n-1 && j==m-1){
//             return 1;
//         }
//         int downpath = countpath(i+1, j, n, m);
//         int rightpath = countpath(i, j+1 , n, m);
//         return downpath + rightpath;
//     }
//     public static void main(String[] args) {
//         int n =3 ;
//         int m = 3;
//         int totalpath = countpath(0, 0, n, m);
//         System.out.println(totalpath);
//     }
// }


//place tiles of size 1Xm in a floor of size nXm.
// public class recursionADV {
//     public static int placeTiles(int n, int m){
//         if(n==m){
//             return 2;
//         }
//         if(n<m){
//             return 1;
//         }
//         int verticalplace = placeTiles(n-m, m);

//         int horizontalplace = placeTiles(n-1, m);

//         return verticalplace + horizontalplace;
//     }
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 2;
//         System.out.println(placeTiles(n, m));
//     }
// }


//find the number of ways to which you can invite n people to your party , single or pairs.

// public class recursionADV {

//     public static int callGuests(int n){
//         if(n<=1){
//             return 1;
//         }
//         //single
//         int ways1 = callGuests(n-1);

//         //pairs
//         int ways2 = (n-1) * callGuests(n-2);

//         return ways1 + ways2;
//     }
//     public static void main(String[] args) {
//         int n=4;
//         System.out.println(callGuests(n));
//     }
// }


// print all the subsets of a set of first n natural numbers.(n=3)

// import java.util.ArrayList;
// public class recursionADV {
//     public static void printSubset(ArrayList<Integer>subsets){
//         for(int i=0; i<subsets.size(); i++){
//             System.out.print(subsets.get(i)+"");
//         }
//         System.out.println();
//     }
//     public static void findSubsets(int n, ArrayList<Integer>subsets){
//         if(n==0){
//             printSubset(subsets);
//             return;
//         }
//         //add hoga
//         subsets.add(n);
//         findSubsets(n-1, subsets);
//         //add nahi hoga
//         subsets.remove(subsets.size()-1);
//         findSubsets(n-1, subsets);
//     }
//     public static void main(String[] args) {
//         int n=3;
//         ArrayList<Integer>subset = new ArrayList<>();
//         findSubsets(n, subset);
//     }
// }
