import java.util.Stack;

public class s7 {
public static boolean isDublicate(String str){
    Stack<Character>s=new Stack<>();

    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        //closing
        if(ch==')'){
            int count=0;
            while(s.peek()!='('){
                s.pop();
                count++;
            }
            if(count<1){
                return true;//dublicate
            }else{
                s.pop();//opening pair
          }  }else{
                s.push(ch);//opening
            }
    }
    return false;
}



public static boolean isDublicate2(String str){//o(n)
    Stack<Character>s=new Stack<>();

    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        //closing
        if(ch==')'){
            int count=0;
            while(s.pop()!='('){
                s.pop();
                count++;
            }
            if(count<1){
                return true;//dublicate
            }}
            else{
                s.push(ch);//opening
            }
        }
    return false;
}
    

    public static void main(String[] args) {
        String str="((a+b))";
        String str2="(a+b)";
System.out.println(isDublicate(str2));

    }
}