package String;
//pallindrome


public class s2 {//O(n)
    public static void main(String[] args) {
        String str="madam";
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        System.out.println(str.equals(rev.toString()));
    System.out.println(isPal(str));
    }




//efficient method
//compare the character last ans began char => ABCCBA

static boolean isPal(String str){
    int began=0;
    int end = str.length()-1;
    while(began<end){
        if(str.charAt(began)!=str.charAt(end)){
            return false;}
            began++;
        end--;        }
        return true;
    }
}
