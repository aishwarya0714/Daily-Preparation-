import java.util.Arrays;

// approach 1 - using Class and object
public class SortArr {


    public static void main(String[] args){
        int[] arr = {2,5,1,6,3};
        // Arrays.sort(arr);
        Solution obj = new Solution();
        int[] newArr = obj.useSort(arr);
        for(int i =0; i < arr.length;i++){
            System.out.println(newArr[i]);
        }
        System.out.println(" ");
    }
}

class Solution{

    /* we are working with arr
    
    we have to declare our method with "int[]"
    
    */  
    int[] useSort(int[] arr)
    {
    
    Arrays.sort(arr);
    return arr;
    }
}