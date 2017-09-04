/**
 * Created by zohrehgorji on 10/20/16.
 */
public class diamondOne {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("//////___________////");
        System.out.println();
        for(int i=0;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("//////___________////");
        System.out.println();
        for(int i=0;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.print(i+j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("//////___________////");
        System.out.println();
        for(int i=0;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("//////___________////");
        System.out.println();
        for(int i=0;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.print(10-i);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("//////___________////");
        System.out.println();
        for(int i=0;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.print(10-j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("//////___________////");
        System.out.println();
        for(int i=0;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.print(Math.abs(10-i-j));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("//////___________////");
        System.out.println();
        for(int i=0;i<10;i++){
            for(int j=0;j<i;j++){
                System.out.print(Math.abs(10-(i+j)));
            }
            System.out.println();
        }
    }
}
