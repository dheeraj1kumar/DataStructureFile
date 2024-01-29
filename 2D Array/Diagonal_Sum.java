//brute force 
//time complexcity =O(n^2)


// public class Diagonal_Sum {
//     public static int diagonalSum(int maitrix[][]){
//         int sum=0;

//         for(int i=0;i<maitrix.length;i++){
//             for(int j=0;j<maitrix.length;j++){
//                 if(i==j){
//                     sum+=maitrix[i][j];
//                 }
//                 else if(i+j==maitrix.length-1){
//                     sum+=maitrix[i][j];
//                 }
//             }
//         }
// return sum;
//     }


//     public static void main(String[] args) {
//         int maitrix[][]={{1,2,3,4},
//                        {5,6,7,8},
//                        {9,10,11,12},
//                        {13,14,15,16}};
//                       System.out.println(diagonalSum(maitrix));
//     }
    
// }




//2nd method best time complexcity i.e big of O(n)
public class Diagonal_Sum  {
    public static int diagonalSum(int maitrix[][]){
        int sum=0;

        for(int i=0;i<maitrix.length;i++){
            //pd
            sum+=maitrix[i][i];
//sd
if(i!=maitrix.length-1-i)
sum+=maitrix[i][maitrix.length-i-1];
        }
return sum;
    }


    public static void main(String[] args) {
        int maitrix[][]={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
                      System.out.println(diagonalSum(maitrix));
    }
    
}