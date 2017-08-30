import java.util.Arrays;

/**
 * Created by zi on 12/4/16.
 */
///*shift to right/left in 1d
//shift a row up and down , a column left and right in 2d*/
public class five {
    public static void main(String[] args) {
   /*        int[] test1 = {1, 2, 3, 4, 5, 6};
             System.out.println(Arrays.toString(test1));

        // OneDshiftELEMENTleft(test1);//[2, 3, 4, 5, 6, 1]
         OneDshiftELEMENTleftREC(test1,0);
          System.out.println(Arrays.toString(test1));*/

     /*   OneDshiftELEMENTright(test1);
        System.out.println(Arrays.toString(test1));*/
        int[][] x =
                {
                        {1, 2, 3, 4},
                        {8, 9, 10, 11},
                        {15, 16, 17, 18},
                        {22, 23, 24, 25}
                };
        for (int i = 0; i < x.length; i++) {
            System.out.println(Arrays.toString(x[i]));

        }
        System.out.println();
        // twoDchange2collumn(x,1,3);
        // twoDchange2row(x,0,1);
        arrayShiftLeft(x);
        for (int i = 0; i < x.length; i++) {
            System.out.println(Arrays.toString(x[i]));

        }
        //arrayShiftLeft(x);
    /*    wechselcolwithrow(x, 3, 0);//col,row

        for (int i = 0; i < x.length; i++) {
            System.out.println(Arrays.toString(x[i]));

        }*/

        print2DrecVersion2(x, 0, 0);
        twoDshiftrowright(x, 2);
        System.out.println();
        print2DrecVersion2(x, 0, 0);
        twoDshiftrowlleft(x, 2);
        System.out.println();
        print2DrecVersion2(x, 0, 0);
  /*      for (int i = 0; i < x.length; i++) {
            System.out.println(Arrays.toString(x[i]));

        }
        System.out.println();
        twoDshiftrowup(x);
        for (int i = 0; i < x.length; i++) {
            System.out.println(Arrays.toString(x[i]));

        }
        System.out.println();
        twoDshiftrowdown(x);
        for (int i = 0; i < x.length; i++) {
            System.out.println(Arrays.toString(x[i]));

        }
*/

    }

    public static void OneDshiftELEMENTleft(int[] list) {
        int first = list[0];
        for (int i = 0; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }
        list[list.length - 1] = first;
    }

    public static void twoDshiftrowlleft(int[][] array, int i) {
        int m = array[i].length;
        int temp = array[i][0];
        for (int k = 0; k < m - 1; k++) {
            array[i][k] = array[i][k + 1];
        }
        array[i][m - 1] = temp;

    }

    public static void OneDshiftELEMENTleftREC(int[] list, int i) {
        int first = list[0];
        if (i < list.length - 1) {
            list[i] = list[i + 1];
            OneDshiftELEMENTleftREC(list, i + 1);
        }
        list[list.length - 1] = first;
    }

    public static void OneDshiftELEMENTright(int[] list) {
        int last = list[list.length - 1];

        for (int i = list.length - 1; i > 0; i--) {
            list[i] = list[i - 1];
        }
        list[0] = last;
    }

    public static void OneDshiftELEMENTrightREC(int[] a) {
    }

    ////////////////
    public static void twoDshiftrowright(int[][] array, int i) {
        int m = array[i].length;
        int temp = array[i][m - 1];
        for (int k = m - 1; k >= 1; k--) {
            array[i][k] = array[i][k - 1];
        }
        array[i][0] = temp;
    }

    public static void twoDshiftrowrightREC(int[][] a, int n) {
    }


    public static void twoDshiftrowleftREC(int[][] a, int n) {
    }
    /////////////

    public static void twoDshiftrowup(int[][] a) {
        int[] firstrow = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = firstrow;
    }

    public static void twoDshiftrowupREC(int[][] a, int n) {
    }

    public static void twoDshiftrowdown(int[][] a) {
        int[] last = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = last;
    }

    public static void twoDshiftrowownREC(int[][] a, int n) {
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
////////////////colomu right left up down


    public static void twoDchange2collumn(int[][] a, int columnA, int columnB) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            temp = a[i][columnA];
            a[i][columnA] = a[i][columnB];
            a[i][columnB] = temp;
        }
    }

    public static void twoDchange2row(int[][] a, int rowa, int rowb) {
        int[] temp;
        temp = a[rowa];
        a[rowa] = a[rowb];
        a[rowb] = temp;
    }


    /*public static void arrayShiftLeftbestimmercol(int[][] array,int col) {
        for (int i=0;i<col;i++){
            arrayShiftLeft(array);
        }
    }*/
    public static void arrayShiftLeft(int[][] array) {
        int[] firstcol = new int[array[0].length];

        for (int i = 0; i < array.length; i++) {
            firstcol[i] = array[i][0];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][(j + 1) % array[i].length];

            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i][array[i].length - 1] = firstcol[i];
        }
    }

    public static void wechselcolwithrow(int[][] array, int col, int row) {
        int temp;

        for (int i = 0; i < array.length; i++) {
            // for (int j = 0; j < array[i].length; j++) {
            // if (array.length > array[i].length) {
            temp = array[row][i];
            array[row][i] = array[i][col];
            array[i][col] = temp;
               /* } else {
                    temp = array[row][j];
                    array[row][j] = array[j][col];
                    array[j][col] = temp;
                }*/
        }
    }
}



