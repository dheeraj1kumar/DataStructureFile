public class LinearSearch {
    public static void linearSearch(int n[],int search){
        
        for(int i=0;i<n.length;i++){
            if(n[i]==search){
                
            System.out.println("Element is found at position: "+search+" at position "+i);
                
            }
            
        }





    }
        public static void main(String[] args) {
           int[] a={1,4,5,6,8};
       int    Serch=8;
       linearSearch(a,Serch);
        }
    }
    

