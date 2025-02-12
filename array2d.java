public class array2d{

    //question 1st
    public static int repeatNo(int arr[][],int n){
        int count = 0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == n){
                    count++;
                }
            }
        }
        return count;
    }


    //question 2nd
    public static int syRowSum(int arr[][]){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i == 1){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    //array print 
    public static void printMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    //transposeMatrix.
    public static void transposeMatrix(int arr[][]){
        int row = 2, col =3;
        printMatrix(arr);
        System.out.println();

        int transpose[][] = new int[col][row];
        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i] = arr[i][j];
            }
        }
        printMatrix(transpose);

    }



    public static void main(String args[]){

        // int arr[][] = {{4,7,8},{8,8,7}};
        // int n = 7;
        // System.out.println(repeatNo(arr, n));


        // int arr[][] = {{1,4,9},{11,4,3},{2,2,3}};
        // System.out.println(syRowSum(arr));


        // int arr[][] = {{2,3,7},{5,6,7}};
        // transposeMatrix(arr);

    }
}