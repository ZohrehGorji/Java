import java.util.Arrays;

/**
 * Created by zi on 3/3/17.
 */
public class ef {
    public static void main(String[] args) {
        String s = "1232434";
        System.out.println("The String is:"+ s);
        
        int array[] = new int[s.length()];
        System.out.println("each character in The String will be shown in a line:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(s.charAt(i));
            array[i] = s.charAt(i);
        }
        String[] ary = s.split("");

        System.out.println(Arrays.toString(ary));
    }
}
