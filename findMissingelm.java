package Array;

// import java.lang.reflect.Array;
import java.util.Arrays;



public class findMissingelm {
    public static void main(String[] args){
        int[] arr = {6,1,2,8,3,4,7,10,5};
        Arrays.sort(arr);
        if(arr[arr.length-1]==arr.length-1){
            System.out.println(arr.length);
        }else{
        for(int i = 0;i< arr.length;i++){
            if(arr[i] != i+1){
                System.out.println(i+1);
            }
        }
        }

    }

}
