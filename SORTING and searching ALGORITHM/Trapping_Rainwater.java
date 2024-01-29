

/*Trapping Rainwater

height=[4,2,0,6,3,2,6]//
(w-x)*width

(waterlevel-barlevel height)*width=trapped water

case1=single bar no tarapped water
case2=2 bar no water trapped

for trapped water take min 3 bar

acesnding and desending order bar no trapped water 
 * 
 */






public class Trapping_Rainwater {

    public static int trappedRainwater(int height[]){//O(n)
        // calculate left max boundary-array
       int n=height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],height[i-1]);
        }

        // calculate right max boundary-array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        //loop
        int trappedWater=0;
        for(int i=0;i<n;i++){
            //waterLevel=min(leftmax bound,rightmax bound)
          int  Waterlevel=Math.min(leftMax[i],rightMax[i]);
          //trapped water=waterlevel-height[i];
          trappedWater += Waterlevel - height[i];
        }
        return trappedWater;

    }
    public static void main(String[] args) {
        int[] height={4,2,0,6,3,2,5};//11 ans
        System.out.println(trappedRainwater(height));
    }
    
}
