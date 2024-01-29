public class cp541 {
//     public static void main(String[] args) {
//     int n=123;

//    int c=0;
//    while(n!=0){
//     int r=n%10;
//     c=c*10+r;
//     n/=10;
    
//    }
// System.out.println(c);}
//     }
    

public static void main(String[] args) {
    String s="abcdefg";
    int l=s.length();
  String  n="";
    char ch;
    for(int i=0;i<2;i++){
        ch=s.charAt(i);
        n=ch+n;
        

    }
    System.out.println(n);
    String v=s.substring(2,l);
    System.out.println(v);
    System.out.println(n.concat(v));
}

}