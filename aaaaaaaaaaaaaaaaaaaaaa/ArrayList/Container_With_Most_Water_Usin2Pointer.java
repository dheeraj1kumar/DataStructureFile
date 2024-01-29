
import java.util.*;
public class Container_With_Most_Water_Usin2Pointer{
    public static int storeWater(ArrayList<Integer>height){
        int maxWater=0;
        int lp=0;   // lp:- left pointer
        int rp=height.size()-1;   // rp:- right pointer
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp)); // height of left pointer which point out at particular  index and height of right pointer
            int width=rp-lp;
            int Current_water=ht*width;
            maxWater=Math.max(maxWater,Current_water);
            if(height.get(lp)<height.get(rp)){
                lp++;

            }
            else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));   
    }
}