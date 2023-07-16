package Array;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderPro{
    public static void main(String[] args){
        int A[] = {16,17,4,3,5,2};
        int n = A.length;

        // 1. create arraylist to store our all Leader elemnts
        ArrayList<Integer> elm = new ArrayList<Integer>();

        //2. take last  most element and store it in our Arraylist as it is the rightmost element
        int L=A[n-1];
        elm.add(A[n-1]);

        //3. create for loop to travers the array take i = n-2 as n-1 (last most elm is already a Leader) travers reverse
        for(int i =n-2;i>=0;i--){

            // 4. if our A[i] elemnt is greater that our current leader then will make it Leader and add it in our ArrayList
            if(A[i]>L){
                L=A[i];
                elm.add(L);
            }
               
        }
        // 5. Afetr addint all Leader we reverse our arraylist
        Collections.reverse(elm);
        
        System.out.println(elm);;
        
    }
}