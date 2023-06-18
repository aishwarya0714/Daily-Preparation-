import java.util.Arrays;

public class GreatAndSmallElm {

    // declare array

    static int[] arr = {3,5,1,8,4};

    // approach 1 -- By Traversing and Iterating 

    // create method for max element
    static int largest(){

        // initial max number

        int max = arr[0];

        for(int i = 1; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            
        }
        return max;
    }

    static int small(){

        int min = arr[0];

        for(int i  = 1 ; i < arr.length; i++){
             if(arr[i]<min){
                min = arr[i];
            }
            
        }
        return min;
    }

    // Approach 3 -- using sort() function
    static int usingSort(int[] arr,int n){
            Arrays.sort(arr);
            return arr[n-1];
    }
    public static void main(String[] args){
        System.out.println("Largest number is " + largest() );
        System.out.println("Largest number is " + small() );

        // Approach 2 -- using stream
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("MAX=" + max);

        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("MIN=" + min);

        int n = arr.length;
        System.out.println("max using sort" + usingSort(arr,n));
    }
}


/* ================================Topics Learnt=======================================

* static methods = The static keyword is used to construct methods that will 
                exist regardless of whether or not any instances of the class are generated. 
                Any method that uses the static keyword is referred to as a static method.

=======================================================================================*/ 