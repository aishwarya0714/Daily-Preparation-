package HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ComElmFrm3Arr {
    public static void main(String[] args){
        // 3 arrays
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};

        // find common elements from the 3 arrays

        // 1. we create 1st Hashset in that we add all duplicates form A and B

        HashSet<Integer> set = new HashSet<>();

        // 2. create another hashset which take duplicate values form C

        HashSet<Integer> set2 = new HashSet<>();

        // 3/ create one arrlist to return all duplicates

        ArrayList<Integer> arr = new ArrayList<>();

        // 4. traver A and add all A elements in set

        for(int i=0;i<A.length;i++){
            set.add(A[i]);
        }

        // 5. traverse B and check for duplicates from set

        for(int j=0;j<B.length;j++){
            if(set.contains(B[j])){
                set2.add(B[j]);
            }
        }

        // 6. traverse C and add all duplicate to arr

        for(int q =0;q<C.length;q++){
            if(set2.contains(C[q])){
                if(!arr.contains(C[q])){
                    arr.add(C[q]);
                }
            }
        }

        // 7. if non of the element is duplicate return -1
        
        if(arr.isEmpty()){
            arr.add(-1);
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
