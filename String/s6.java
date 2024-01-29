package String;
//pattern searching problems

/*
m=pattern length
n=text length
m<=n

-----------------------------------------------
1.Naive=O(n-m+1)*m)      no preprocessing

2Naive when all character of pattern distinct :O(n)
--------------------------------------------------------
3=Rabin karp:O(n-m+1)*m)  processing pattern

4=KMP:O(n)
-------------------------------------------------
5=suffix tree:O(m) preprocess text

 */






public class s6 {
    public static void main(String[] args) {
        String str="ABABABCD";
        String pat="ABAB";
        patternMatch(str,pat);
    }

    static void patternMatch(String txt,String pat){
        int m=pat.length(),n=txt.length();
        
        for(int i=0;i<=n-m;i++){
           int j;
            for(j=0;j<m;j++)
                if(pat.charAt(j)==txt.charAt(i+j))
                    break;
if(j==m)
    System.out.print(i+" ");

    }}
}
