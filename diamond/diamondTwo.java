/**
 * Created by zohrehgorji on 10/20/16.
 */
public class diamondTwo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j<10; j++) {
                System.out.print(".");
            }
            for (int j = i; j<10; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
