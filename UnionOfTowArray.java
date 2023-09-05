package HashSet;

import java.util.HashSet;

public class UnionOfTowArray {
    public static void main(String[] args){
        // we have 2 arrays

        int[] a = {1,2,3,4,5};
        int[] b = {1,3,4};

        // find the union of tow array

        // for that will create HashSet

        HashSet<Integer> set = new HashSet<>();

        // traverse each array using for loop and add each array element into the Hashset

        // travers arr a
        for(int i =0;i<a.length;i++){
            set.add(a[1]);
        }

        // travers array b
        for(int j=0;j<b.length;j++){
            set.add(b[j]);
        }

        // get the hashset size

        System.out.println(set.size());
    }

}
