package String;

public class s1 {
    public static void main(String[] args) {
        String str= "geekforgeeks";
        int []count =new int[26];
        for(int i=0; i<str.length();i++){
count[str.charAt(i)-'a']++;

for(int j=0;j<26;j++){
if(count[j]>0){
    System.out.println((char)(j+'a')+" "+count[j]);
}
}


        

       }
    }
    
}
