import java.util.Arrays;

/**
 * Created by zi on 12/4/16.
 */
//repeat char
public class four {
    public static void main(String[] args) {
        repeat(12);
        System.out.println();
        repeat2(12);
        System.out.println();
        System.out.println(repeat3(12));
        System.out.println();
        int[][] x={{1,2,3},{4,5},{6,7,8,9}};
        a(x, x.length);
        System.out.println();

    }

    public static void a(int[][] a,int n) {
        if (n > 0) {
            a(a, n - 1);
            System.out.println(Arrays.toString(a[n-1]));


        }
    }
    public static String repeat3(int n){
        if(n==0){
            return "0";
        }

       return(n==1?1+"":n+"."+repeat3(n-1));//12.11.10.9.8.7.6.5.4.3.2.1

    }
    public static void repeat(int m){
        if(m==0){
            return;
        }
            repeat(m-1);//1 2 3 4 5 6 7 8 9 10 11 12
            System.out.print(m+" ");

    }
    public static void repeat2(int m){
        if(m==0){
            return;
        }
        System.out.print(m+" ");//12 11 10 9 8 7 6 5 4 3 2 1
        repeat2(m-1);


    }
}
