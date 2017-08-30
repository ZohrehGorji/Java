import java.util.Arrays;

/**
 * Created by zi on 12/4/16.
 */
public class two {
    //fill array 1D,2D,3D iter & rec
    //fill with 1,to n
    // fill with random
    //fill with n

    public static void main(String[] args) {
        int[] arrayOneD = new int[5];
        filOneDRecursive(arrayOneD, 0);
        System.out.println(Arrays.toString(arrayOneD));

        int[] array1D = {1, 2, 3, 4, 5, 5, 6, 6};
        fill1DRec(array1D, 0, array1D.length);
        System.out.println(Arrays.toString(array1D));

        int[][] array2D = new int[5][5];
        fill2DRec(array2D, 0, 0, 1);
        for (int i = 0; i < array2D.length; i++) {
            System.out.println(Arrays.toString(array2D[i]));
        }
        int[][][] array3D = new int[3][4][2];// 3 box, 4 row, each 2 column
        fill3DRec(array3D, 0, 0, 0, 1);
        print3DRec(array3D, 0, 0, 0);
    }


    public static void filOneDRecursive(int[] arr, int i) {
        if (i < arr.length) {
            arr[i] = i + 1;
            filOneDRecursive(arr, i + 1);


        }

    }

    public static void fill1DRec(int[] arr, int begin, int end) {
       /* if (end < 0) {
            return;
        }*/
        //        fill1DRec(arr, begin + 1, end - 1);
        if (begin > end) {
            return;
        }
        if (begin < arr.length) {
            //arr[begin] = end
            //[8, 7, 6, 5, 4, 3, 2, 1] //   fill1DRec(array1D,0,array1D.length);
            arr[begin] = begin + 1;
        }
        fill1DRec(arr, begin + 1, end);
    }

       /* if(begin < arr.length){ //[1, 2, 3, 4, 5, 6, 7, 8] //  fill1DRec(array1D,0,1);
                arr[begin] = end;
            fill1DRec(arr, begin+1, end + 1);
            }*/

    public static void fill1DIter(int[] array1D) {
        for (int i = 0; i < array1D.length; i++) {
            array1D[i] = i + 1;
        }

    }

    public static void fill2DIter(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = i + 1;
            }
        }

    }

    public static void fill2DRec(int[][] arr, int row, int column, int number) {
        if (row < arr.length) {
            if (column < arr[row].length) {
                arr[row][column] = number;
                fill2DRec(arr, row, column + 1, number + 1);
            } else {
                number -= 1;
                fill2DRec(arr, row + 1, 0, number + 1);
            }
        }
    }

    public static void fill3DIter(int[][][] array3D) {
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k] = i + 1;
                }
            }
        }
    }

    public static void fill3DRec(int[][][] arr, int row, int column, int extra, int number) {

        if (row < arr.length) {

            if (column < arr[row].length) {
                if (extra < arr[row][column].length) {

                    arr[row][column][extra] = number;
                    fill3DRec(arr, row, column, extra + 1, number + 1);
                } else {
                    number--;
                    fill3DRec(arr, row, column + 1, 0, number + 1);
                }
            } else {
                number--;
                fill3DRec(arr, row + 1, 0, 0, number + 1);
            }
        }

    }

    public static void print3DRec(int[][][] arr, int row, int column, int extra) {
        if (row < arr.length) {
            if (column < arr[row].length) {
                if (extra < arr[row][column].length) {
                    System.out.print(arr[row][column][extra] + "\t");
                    print3DRec(arr, row, column, extra + 1);
                } else {
                    print3DRec(arr, row, column + 1, 0);

                }
            } else {
                print3DRec(arr, row + 1, 0, 0);
            }
        }
    }

}
