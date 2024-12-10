//print permutation of string ABC
 public class backtracking {
//     public static void printPermutation(String str, String perm , int idx){
//         if(str.length()==0){
//             System.out.println(perm);
//             return;
//         }
//         for(int i=0; i<str.length(); i++){
//             char currchar = str.charAt(i);
//             String newStr = str.substring(0, i) + str.substring(i+1);
//             printPermutation(newStr, perm+currchar, idx+1);
//         }
//     }

//     public static void main(String[] args) {
//      String str = "ABC";
//      printPermutation(str, " ", 0);   
//     }
// }



//N queen.
// public class backtracking {
//     public static void main(String[] args) {
//         int n = 4;
//         char[][] board = new char[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 board[i][j] = 'X';
//             }
//         }
//         nqueen(board,0);
//     }

// private static void nqueen(char [][] board , int row){
//     int n= board.length;
//     if(row == n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//         return;
//     }
//     for(int j=0;j<n;j++){
//         if(issafe(board, row, j)){
//             board [row][j]='Q';
//             nqueen(board, row+1);
//             board[row][j]='x';//backtraking
//         }
//     }
// }
// private static boolean issafe(char [][] board , int row , int col){
//     int n= board.length;
//     //check row
//     for(int j=0;j<n;j++){
//         if(board [row][j] =='Q')return false;
//     }
//     // check col
//     for(int i=0;i<n;i++){
//         if (board[i][col]=='Q') return false;
//     }
//     //check north east 
//     int i=row;
//     int j=col;
//     while (i>=0 && j<n) {
//         if(board[i][j]=='Q') return false;
//         i--;
//         j++;
//     }
//     //check south east
//     i=row;
//     j=col;
//     while (i<n&&j<n) {
//         if(board[i][j]=='Q') return false;
//         i++;
//         j++;
//     }
//     //check south west
//     i=row;
//     j=col;
//     while (i<n && j>=0) {
//         if(board[i][j]=='Q')return false;
//         i++;
//         j--;
//     }
//     //check north west 
//     i=row;
//     j=col;
//     while (i>=0 && j>=0) {
//         if(board[i][j]=='Q')return false;
//         i--;
//         j--;
//     }
//     return true;
// }
// }




//sodoku solver
// public class backtracking {
//     public boolean isSafe(char[][] board, int row, int col, int number) {
//         // column
//         for (int i = 0; i < board.length; i++) {
//             if (board[i][col] == (char) (number + '0')) {
//                 return false;
//             }
//         }
//         // row
//         for (int j = 0; j < board.length; j++) {
//             if (board[row][j] == (char) (number + '0')) {
//                 return false;
//             }
//         }
//         // grid
//         int sr = 3 * (row / 3);
//         int sc = 3 * (col / 3);
//         for (int i = sr; i < sr + 3; i++) {
//             for (int j = sc; j < sc + 3; j++) {
//                 if (board[i][j] == (char) (number + '0')) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }

//     public boolean helper(char[][] board, int row, int col) {
//         if (row == board.length) {
//             return true;
//         }
//         int nrow = 0;
//         int ncol = 0;
//         if (col == board.length - 1) {
//             nrow = row + 1;
//             ncol = 0;
//         } else {
//             nrow = row;
//             ncol = col + 1;
//         }
//         if (board[row][col] != '.') {
//             if (helper(board, row, ncol)) {
//                 return true;
//             }
//         } else {
//             // fill the place
//             for (int i = 1; i <= 9; i++) {
//                 if (isSafe(board, row, col, i)) {
//                     board[row][col] = (char) (i + '0');
//                     if (helper(board, nrow, ncol)) {
//                         return true;
//                     } else {
//                         board[row][col] = '.';
//                     }
//                 }
//             }
//             return false;
//         }
//         return false;
//     }

//     public void solveSudoku(char[][] board) {
//         helper(board, 0, 0);
//     }
 }
