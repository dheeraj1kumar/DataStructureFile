//remove duplicates in a string

public class re9 {
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        //kam
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            //duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
        map[currchar-'a']=true;
        removeDuplicates(str, idx, newStr.append(currchar), map);

        }
    }

    public static void main(String[] args) {
        String str="apanacollege";
        removeDuplicates(str, 0,new StringBuilder(""), new boolean[26]);
    }
}
