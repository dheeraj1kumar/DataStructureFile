package String;
import java.util.*;
public class s5 {
    public static void main(String[] args) {
        String str ="ABCCBD";
        System.out.println(leftMost(str));
        System.out.println(s5.leftMost2(str));
        System.out.println(nonRep(str));
    }

    static final int CHAR=256;

    //method 1
   static int leftMost(String str){
        int findex[]=new int[CHAR];
        Arrays.fill(findex,-1);
        int res=Integer.MAX_VALUE;
        for(int i=0;i<str.length();i++){
            int fi=findex[str.charAt(i)];
            if(fi==-1){
                findex[str.charAt(i)]=i;
            }
            else{
                res=Math.min(res,fi);
            }
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }


    //method-2
  static  int leftMost2(String str){
        boolean []visited = new boolean[CHAR];
        int res=-1;
        for(int i=str.length()-1;i>=0;i--){
            if(visited[str.charAt(i)]){
                res=i;
            }
            else{
                visited[str.charAt(i)]=true;
            }
        }
return res;
    }


    //NOt repeating character

 static   int nonRep(String str){
        int count[] = new int[CHAR];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}
