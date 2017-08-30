import java.util.Arrays;

/**
 * Created by zi on 12/4/16.
 */
// 1d to 2d
// 2d to 1d
public class three {
    public static void main(String[] args) {
        int[][] Array2D = new int[2][4];
        Array2D[0][0] = 1;
        Array2D[0][1] = 12;
        Array2D[0][2] = 3;
        Array2D[0][3] = 30;
        Array2D[1][0] = 4;
        Array2D[1][1] = 56;
        Array2D[1][2] = 345;
        Array2D[1][3] = 7;
        // int[] Array1D = new int[Array2D.length * Array2D[0].length];
        //  twoDtoOneD(Array2D,Array1D);
        // twoDtoOneDrec(Array2D, Array1D, 0, 0);
        // System.out.println("Array2D " + Arrays.deepToString(Array2D) + " to");
        //  System.out.println("Array1D " + Arrays.toString(Array1D) + " .");
        int[] test1 = {1, 3, 4, 6, 7, 8, 4, 3, 5};
        int size = test1.length;
        int[][] test2 = new int[2][size / 2];
        // System.out.println("test1 " + Arrays.toString(test1));
        OneDtoTwoD(test2, test1);

        //  OneDtoTwoDrec(test2, test1, 0, 0);
        System.out.println(Arrays.deepToString(test2));

    }

    public static void twoDtoOneD(int[][] Array2D, int[] Array1D) {//// 2d to 1d

        for (int i = 0; i < Array2D.length; i++) {
            for (int j = 0; j < Array2D[i].length; j++) {
                Array1D[i * Array2D[i].length + j] = Array2D[i][j];

            }

        }

    }

    public static void twoDtoOneDrec(int[][] Array2D, int[] Array1D, int i, int j) {//// 2d to 1d

        if (i < Array2D.length) {
            if (j < Array2D[i].length) {
                Array1D[i * Array2D[i].length + j] = Array2D[i][j];

                twoDtoOneDrec(Array2D, Array1D, i, j + 1);
            } else {
                j = 0;
                twoDtoOneDrec(Array2D, Array1D, i + 1, j);
            }
        }

    }
    //j=j-3;
    //  twoDtoOneDrec(Array2D, Array1D, i+1, j );

    public static void OneDtoTwoDrec(int[][] Array2D, int[] Array1D, int i, int j) {//// 1d to 2d
//test2=test1
        if (i < Array2D.length) {
            if (j < Array2D[i].length) {

                Array2D[i][j] = Array1D[i * Array2D[i].length + j];

                OneDtoTwoDrec(Array2D, Array1D, i, j + 1);
            } else {
                j = 0;
                OneDtoTwoDrec(Array2D, Array1D, i + 1, j);
            }

        }

    }

    public static void OneDtoTwoD(int[][] Array2D, int[] Array1D) {//// 1d to 2d

        for (int i = 0; i < Array2D.length; i++) {
            for (int j = 0; j < Array2D[i].length; j++) {
                Array2D[i][j] = Array1D[i * Array2D[i].length + j];
               /*  for (int index=0;index<Array1D.length;index++) {//not correct like this.
                    Array1D[index] = Array2D[i][j];
                }*/
            }

        }

    }

}
