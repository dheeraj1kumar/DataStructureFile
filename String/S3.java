package String;
//subsequence
public class S3 {//O(m+n)
    public static void main(String[] args) {
        String s1="ABCDEF";
        String s2="ADE";
        int n=s1.length()-1;
        int m=s2.length()-1;
if(n<m){
    System.out.println("flase");
    return ;
}
        int j=0;
        for(int i=0;i<n&&j<m;i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
                 System.out.println("true");
            }
        }
       
    }
}
