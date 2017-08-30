import java.util.Arrays;

/**
 * Created by zi on 12/4/16.
 */
public class one {
    //print array 1D,2D,3D inter & rec
    public static void main(String[] args) {
        int[] array1D = {1, 2, 3, 4, 5};
        int[][] array2D = {{1, 2, 3}, {4, 6}, {7, 8, 9}};
        int[][][] array3D = {{{1, 2, 3}}, {{4, 6}, {7, 8, 9}}};
        print3DRec(array3D, 0, 0, 0);


        //print1DIter(array1D);
        //print1DRec(array1D,array1D.length);
        //print1DR(array1D);
        //print2DIter(array2D);
        //print2D(array2D);
        //print2DrecVersion2(array2D,0,0);
        //print3DIter(array3D);

    }

    public static void print1DR(int[] array1D) {
        print1DRec(array1D, array1D.length);
    }

    public static void print1DRec(int[] array1D, int index) {
        if (index <= 0) {
            return;
        }
        print1DRec(array1D, index - 1);
        System.out.print(array1D[index - 1]);


    }

    public static void print1DIter(int[] array1D) {
        for (int i = 0; i < array1D.length; i++) {
            System.out.print(array1D[i] + "\t");
        }
    /*    System.out.println();
        for (int number:array1D) {
            System.out.print(number+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array1D));*/
    }


    public static void print2D(int[][] array2D) {
        print2Drec(array2D, array2D.length - 1);

    }

    public static void print2DrecVersion2(int[][] arr, int row, int column) {
        if (row < arr.length) {
            if (column < arr[row].length) {
                System.out.print(arr[row][column] + "\t");
                print2DrecVersion2(arr, row, column + 1);
            } else {
                print2DrecVersion2(arr, row + 1, 0);
            }
        }
    }

    public static void print2Drec(int[][] array2D, int index) {
        if (index < 0) {
            return;
        }
        print2Drec(array2D, index - 1);

        print1DR(array2D[index]);


    }

    public static void print3DIter(int[][][] array3D) {
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                System.out.println(Arrays.toString(array3D[i][j]));
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

    public static void print2DIter(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D.length; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
        }
        System.out.println();
        System.out.println("foreach");
        for (int[] number : array2D) {
            for (int num : number) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("tostr");
        for (int i = 0; i < array2D.length; i++) {
            System.out.println(Arrays.toString(array2D[i]));
        }
        System.out.println("deeptostr");

        System.out.println(Arrays.deepToString(array2D));
        System.out.println();
        System.out.println("use 1diter arrays");
        for (int i = 0; i < array2D.length; i++) {
            print1DIter(array2D[i]);
        }

    }

  
}
