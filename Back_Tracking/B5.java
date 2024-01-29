package Back_Tracking;

import java.util.HashSet;

public class B5 {

    public static void main(String[] args) {
 




String ans = "aabbddcbc";
String x = "";
      for (int i = 0; i < ans.length(); i++) {
        
           char c = ans.charAt(i);
           if(x.indexOf(c)<0){
             x+=c;
           }
      }
      System.out.println(x);


    }
   
}