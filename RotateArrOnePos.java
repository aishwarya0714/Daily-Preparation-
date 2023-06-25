package ArrayList;
import java.util.ArrayList;
public class RotateArrOnePos {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0;i<arr.length-1;i++){
            result.add(arr[i]);
        }
        result.add(0,arr[arr.length-1]);
        System.out.println(result);

    }
}
