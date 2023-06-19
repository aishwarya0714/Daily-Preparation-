
public class peak {
    public static void main(String[] args){
        int[] arr = {12,56,23,90,78};

      

        for (int i = 1; i < arr.length -1 ; i++){
            if (arr[i] > arr[i-1] & arr[i] > arr[i+1]){
                System.out.println(arr[i]);
                
        }
            }
    }
}



       
