//return first occurance

// public class re6 {
//     public static int firstOccurance(int arr[], int key, int i){
//         if(i==arr.length){
//             return -1;
//         }
//         if(arr[i]==key){
//             return i;
//         }

//         return firstOccurance(arr,key,i+1);
//     }
//     public static void main(String[] args) {
//         int arr[]={8,3,6,9,5,10,5};
//     System.out.println(firstOccurance(arr, 5, 0));    }
    
// }


//return lastOccurance



    public class re6 {
            public static int lastOccurance(int arr[], int key, int i){
                if(i==arr.length){
                    return -1;
                }
                int isfound=lastOccurance(arr,key,i+1);
                if(isfound==-1 && arr[i]==key){
                    return i;
                }
        
                return isfound;
            }
            public static void main(String[] args) {
                int arr[]={8,3,6,9,5,10,5};
            System.out.println(lastOccurance(arr, 5, 0));    }
            
        }
        
    