
//two pointer approach
import java.util.Arrays;
class cp344{

 static  String[] m1(String[] s){
    int start = 0;
    int end = s.length-1;
    while(start < end){
        String temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        start++;
        end--;}
        return s;
    
}

    public static void main(String[] args) {
       
        String[] s={"a","b","d"};
System.out.println( Arrays.toString(cp344.m1(s)));
    }
}