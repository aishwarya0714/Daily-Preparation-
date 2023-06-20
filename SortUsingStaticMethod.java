import java.util.Arrays;

// Approach 2 -  using Static method
class sortUsingStaticMethod{

static int[] usingSort(int[] arr){

    Arrays.sort(arr);
    // int[] newArr;
    for(int i =0;i <arr.length;i++){
        System.out.println(arr[i]);
    }
    return arr;
}
    public static void main(String[] args)        
    {
        int[] arr = {1,5,2,7,4};
        System.out.println("Array: "+usingSort(arr));


    }

}