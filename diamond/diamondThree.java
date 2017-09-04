/**
 * Created by zohrehgorji on 10/20/16.
 */
public class diamondThree {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            for (int j = 10; j > i; j--) {
                System.out.print("-");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

//oben, du hast zwei unterschiedliche for, also kommt eine nach die andere
        //unten hast du alles in eine for, es funktuniert wie array , weil i ist gleich für alles-
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 1; i <= 10; i++) {

            for (int j = 10; j > i; j--) {
                System.out.print("-");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < 10; i++) {

                for (int j = 10; j > i; j--) {
                    System.out.print(" ");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print("+");
                }

                for (int j = 0; j < i; j++) {
                    System.out.print("#");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < 10; i++) {

            for (int j = 10; j > i; j--) {
                System.out.print(" .");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" +");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" #");

            }
            System.out.println();
        }


        //chnage i because we go for down side
        //chnage i because we go for down side
        //chnage i because we go for down side(new schleife)

        for (int i = 0; i < 10; i++) {


            for (int j = 0; j < i; j++) {//4
                System.out.print("  ");
            }
                for (int j = 10; j > i; j--) {//3
                    System.out.print(" o");
                }

            for (int j = 10; j > i; j--) {
                System.out.print(" :");

            }
                System.out.println();
        }
    }
}
