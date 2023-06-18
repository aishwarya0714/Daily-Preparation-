import java.util.*;

public class AccaessArrayElm {
    public static void main(String[] args){
        
        System.out.println("Enter number of element to add: ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        // insert elements

        System.out.println("Enetr array elements: ");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // Print array elements
        System.out.println("Array: ");
        for(int j = 0 ; j<size;j++){
            System.out.println(arr[j]);
        }

        // reverse array
        System.out.println("reverse: ");
        for(int q = size - 1 ; q >= 0 ; q--){
            System.out.println(arr[q]);
        }

    }
}
