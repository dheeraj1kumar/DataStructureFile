import java.util.Scanner;
public class Take_Element_By_user {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of rows and columns:");
        int r = s.nextInt();
        int c = s.nextInt();

        //creates an matrix
        int[][] a = new int[r][c];
        System.out.println("Enter the array element:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("index [%d][%d]:",i,j);

                a[i][j] = s.nextInt();

            }
        }
        System.out.println("print matrix element:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)


                System.out.printf("%d \t",+a[i][j]);

            System.out.println();
        }
    }
}