//qs1.print number from 5 to 1.
// public class L17recursion {
//     public static void PrintNumb(int n){
//     if(n==0){
//         return;
//     }
//     System.out.println(n);
//     PrintNumb(n-1);
// }
//     public static void main(String[] args) {
//         int n = 5;
//         PrintNumb(n);
//     }
// }



//print number from 1 to 5.
// public class L17recursion {
//     public static void PrintNumb(int n){
//         if(n==6){
//             return;
//         }
//         System.out.println(n);
//         PrintNumb(n+1);
//     }
//     public static void main(String[] args) {
//         int n=1;
//         PrintNumb(n);
//     }
// }


//print sum of first n natural numbers.
// public class L17recursion {
//     public static void PrintNumb(int i,int n, int sum){
//         if(i==n){
//             sum +=i;
//             System.out.println(sum);
//             return;
//         }
//         sum += i;
//         PrintNumb(i+1, n, sum);
//     }
//     public static void main(String[] args) {
//         PrintNumb(1, 5, 0);
//     }
// }


//print the factorial of first n numbers.
// public class L17recursion {
//     public static int calcfactorial(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//         int fact_nm1 = calcfactorial(n-1);
//         int fact_n = n*fact_nm1;
//         return fact_n;
//     }
//     public static void main(String[] args) {
//         int n = 5;//change value of n to find different n factorial.
//         int ans = calcfactorial(n);
//         System.out.println(ans);
//     }
// }


// print the fibonacci sequence till the nth term
// public class L17recursion {
//     public static void printfib(int a , int b, int n){
//         if(n==0){
//             return;
//         }
//         int c = a+b;
//         System.out.println(c);
//         printfib(b, c, n-1);
//     }
//     public static void main(String[] args) {
//         int a=0,b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int n=7;
//         printfib(a, b, n-2);
//     }
// }


//print x^n(stack height = n)
// public class L17recursion {
//     public static int calcpower(int x , int n){
//         if(n==0){
//             return 1;
//         }
//         if (x==0) {
//             return 0;
//         }
//         int xpownm1 = calcpower(x, n-1);
//         int xpown = x * xpownm1;
//         return xpown;
//     }
//     public static void main(String[] args) {
//         int x=2,n=5;
//         int ans = calcpower(x, n);
//         System.out.println(ans);
//     }
// }



//print x^n(stack height = logn)
// public class L17recursion {
//     public static int calcpower(int x, int n){
//         if(n==0){
//             return 1;
//         }if(x==0){
//             return 0;
//         }
//         //if n is even
//         if(n%2==0){
//             return calcpower(x, n/2) * calcpower(x, n/2);
//         }else{
//             return calcpower(x, n/2) * calcpower(x, n/2)*x;
//         }
//     }
//     public static void main(String[] args) {
//         int x =2, n = 5;
//         int ans = calcpower(x, n);
//         System.out.println(ans);
//     }
// }


//recursion one shot lecture.(clss 2 of recursion)


//tower of hanoi
// public class recursion {
//     public static void towerofhanoi(int n , String src , String helper, String dest){
//         if(n==1){
//         System.out.println("transfer disk"+" " + n +" " + "from"+" " + src +" "+ "to"+ " "+ dest);
//         return;
//         }
//         towerofhanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk"+" " + n +" " + "from"+" " + src +" "+ "to"+ " "+ dest);
//         towerofhanoi(n-1, helper, src, dest);
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         towerofhanoi(n, "S", "H", "D");
//     }
// }


// reverse the abcd in recursion.
// public class recursion {
//     public static void printrev(String str , int idx){
//         if(idx == 0){
//             System.out.println(str.charAt(idx));
//             return;
//         }
//         System.out.print(str.charAt(idx));
//         printrev(str, idx-1);
//     }
//     public static void main(String[] args) {
//         String str = "ABCD";
//         printrev(str,str.length()-1);
//     }
// }


// // find the occurance of the element.
// public class recursion {
//     public static int first = -1;
//     public static int last = -1;
//     public static void findoccurance(String str, int idx, char element){
//         if(idx == str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         if (currchar == element){
//             if(first == -1){
//                 first = idx;
//             }
//             else{
//                 last = idx;
//             }
//         }
//         findoccurance(str, idx+1, element);
//     }
//     public static void main(String[] args) {
//         String str = "abaacdaefaahc";
//         findoccurance(str, 0, 'a');
//     }
// }


// check if array is sorted (strickly increasing)
// public class recursion {
//     public static boolean isSorted(int arr[] , int idx){
//         if(idx == arr.length-1){
//             return true;
//         }
//         if(arr[idx]<arr[idx+1]){
//             return isSorted(arr, idx+1);
//         }else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 3, 6};
//         System.out.println(isSorted(arr, 0));
//     }
// }


//move all the x in last of the string.
// public class recursion {
//     public static void moveallx(String str, int idx, int count, String newString){
//         if (idx == str.length()) {
//             for(int i=0; i<count; i++){
//                 newString += 'x';
//             }
//             System.out.println(newString);
//             return ;
//         }
//         char currchar = str.charAt(idx);
//             if(currchar == 'x'){
//                 count++;
//                 moveallx(str, idx+1, count, newString);
//             }else{
//                 newString += currchar;
//                 moveallx(str, idx+1, count, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "axbcxxkjmd";
//         moveallx(str, 0, 0, "");
//     }
// }


//remove duplicate element from the string.
// public class recursion {
//     public static boolean [] map = new boolean[26];
//     public static void removeDuplicatestring(String str, int idx , String newString){
//         if(idx == str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         if(map[currchar - 'a']){
//             removeDuplicatestring(str, idx+1, newString);
//         }else{
//             newString += currchar;
//             map[currchar - 'a'] = true;
//             removeDuplicatestring(str, idx+1, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "abbccda";
//         removeDuplicatestring(str, 0, "");
//     }
// }


//print all the subsequences of a string ("abc")
// public class recursion {
//     public static void subsequences(String str , int idx , String newString){
//         if(idx == str.length()){
//             System.err.println(newString);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         // to be
//         subsequences(str, idx+1, newString+currchar);
//         // or not to be
//         subsequences(str, idx+1, newString);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         subsequences(str, 0, "");
//     }
// }


//print all the unique subsequences of a string("aaa")
// import java.util.HashSet;
// import java.util.Set;
// public class recursion {
//     public static void uniquesequence(String str, int idx , String newString, HashSet<String>set){
//         if(idx == str.length()){
//             if(set.contains(newString)){
//                 return;
//             }else{
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
//         }
//         char currchar = str.charAt(idx);
//             // to be
//             uniquesequence(str, idx+1, newString +currchar ,set);
//             // or not to be
//             uniquesequence(str, idx+1, newString , set);
//     }
//     public static void main(String args[]){
//         String str = "aaa";
//         HashSet<String>set = new HashSet<>();
//         uniquesequence(str, 0, "", set);
//     }
// }


//print keypad combination
// public class recursion {
//     public static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","xyz"};
//     public static void printcomb(String str, int idx , String combination){
//         if (idx == str.length()){
//             System.out.println(combination);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         String mapping = keypad [currchar - '0'];
//         for(int i=0; i<mapping.length(); i++){
//             printcomb(str, idx+1, combination + mapping.charAt(i));
//         }
//     }
//     public static void main(String[] args) {
//         String str = "4";
//         printcomb(str, 0, "");
//     }
// }