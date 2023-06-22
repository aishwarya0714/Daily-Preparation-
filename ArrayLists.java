package ArrayList;
// ==================================ArrayList==================================================
/*
                    1. changeable size
                    2. non contibues
                    3. we can store objects
                    4. Store in heap
 */
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add 
        list.add(10);
        list.add(12);
        list.add(20);

        System.out.println(list);

        // get
        int n = list.get(1);
        System.out.println(n);

        // add element in between 
        list.add(2,18);
        System.out.println(list);

        // set
        list.set(0,1);
        System.out.println(list);

        // size 
        int s = list.size();
        System.out.println(s);

        // remove

        list.remove(3);
        System.out.println(list);

        // loops
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // sort
        Collections.sort(list);        
    }
}