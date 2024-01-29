// public class NQueen2 {
//     public static boolean isSafe(char board[][],int row,int col){
//         //  vertical up
//         for(int i=row-1;i>=0;i--){
//             if(board[i][col]=='Q'){
//                 return false;
//             }
//         }
//         // diagonal left up
//         for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
//             if(board[i][j]=='Q'){
//                 return false;
//             }
//         }
//         for(int i=row-1,j=col+1;j>=0 && j<board[0].length;i--,j++){
//             if(board[i][j]=='Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void NQueens(char board[][],int row) {

//         // base case
//         if(row==board.length){
//             printBoard(board);
//             return;
//         }
//         // coloumn loop
//         for(int j=0;j<board[0].length;j++){
//             if(isSafe(board,row,j)){
//                 board[row][j]='Q';
//                 NQueens(board,row+1);
//                 board[row][j]='X';
//             }
//         }
//     }
//     public static void printBoard(char board[][]){
//         System.out.println("--------- chess Board");
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n=4;
//         char board[][]=new char[n][n];
//         //initialze
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 board[i][j]='X';
//             }
//         }
//         NQueens(board,0);
//     }
// }
