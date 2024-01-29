
import java.util.Scanner;

public class Search_Element_in_matrix {
    public static boolean search(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j]==key){
                    System.out.println("found at cell("+i+","+j+")");
                    return true;
                }
            }
        }
            System.out.println("key not found");
            return false;
        }
    

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
    System.out.println(search(a, 5));
}
    
}
