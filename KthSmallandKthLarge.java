import java.util.*;

public class KthSmallandKthLarge {
    // static method for kth small

    // for small we sort our array then return the k-1 index value which is our kth smallest number
    static int KthSmall(int[] arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    // for largest we sort our array then return kth largest element by arr.legnth - k index value
    static int kthLarge(int[] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length-k];
    }
    public static void main(String[] args){
        int[] arr = {3,5,1,8,10};
        System.out.println("Enter value of K: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("kth smallest number is:" + KthSmall(arr, k));
        System.out.println("kth Largest number is:" + kthLarge(arr, k));

    }
}
