package Array;

public class findCeiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 6;
        System.out.println(findCeilingNumber(arr,target));
        
    }

    static int findCeilingNumber(int[] arr,int target){
        // intrate through array
        for (int i=0;i<arr.length;i++){
            // if elm is greater or equesl to target return it
            if(arr[i]>=target){
               return arr[i];
               
            }
        }
        return 0;
    }
}
