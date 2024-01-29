import java.util.ArrayList;
public class PairSum_BruteForce {
    public static boolean pairsum1(ArrayList<Integer>list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+i;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }

            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(7);
        list.add(8);
        System.out.println(pairsum1(list, 5));

    }
    
}
