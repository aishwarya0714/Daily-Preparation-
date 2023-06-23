package ArrayList;

import java.util.ArrayList;

public class UnionOfArray {
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        int[] b = {1,2,3,6};
        
        ArrayList<Integer> union = new ArrayList<>();

        for(int i = 0;i<a.length;i++){
            union.add(a[i]);
        }
        for(int j =0;j<b.length;j++){
            if(union.get(j)!=b[j]){
                union.add(b[j]);
            }
        }
        System.out.println(union);
        System.out.println(union.size());
    }
}
