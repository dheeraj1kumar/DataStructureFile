package String;

import java.lang.reflect.Array;
import java.util.*;
public class s4 {
    public static void main(String[] args) {
        String s1="ABC";
                String s2="CBA";
System.out.println(areAnagram(s1, s2));

System.out.println(areAnagram2(s1,s2));
    }


    static boolean areAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char a1[]=s1.toCharArray();
        Arrays.sort(a1);
        s1=new String(a1);


         char a2[]=s2.toCharArray();
        Arrays.sort(a2);
        s2=new String(a2);
    
return s1.equals(s2);
}

//efficient way : O(n+CHAR)
static final int CHAR = 256;
static boolean areAnagram2(String s1, String s2){
       if(s1.length()!=s2.length()){
        return false;
       }
       int count[]=new int[CHAR];//store frequency array 
       for(int i=0;i<s1.length();i++){
        count[s1.charAt(i)]++;
        count[s2.charAt(i)]--;

       }
       for(int i=0;i<CHAR;i++){
        if(count[i]!=0){
             return false;
        }
       }
       return true;
}

}