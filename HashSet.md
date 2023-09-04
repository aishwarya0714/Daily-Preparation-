# HashSet 

### it is very important data structure for time complexity

### 1. insert/Add - O(1) = constant time
### 2. Search/ Contains - O(1) = constant time
### 3. Delete/ Remove O(1) = constant time

# Exapmle:- GFG = find duplicates from array
package ArrayList;

import java.util.*;

public class FindDuplicate {
    public static void main(String[] args){
        int[] arr = {3 ,4 ,12, 3 ,12, 3 ,4 ,4, 12 ,7 ,11, 6 ,5};
        HashSet<Integer> list = new HashSet<>();
        HashSet<Integer> elements = new HashSet<>();
        elements.add(arr[0]);
        for(int i = 1 ;i<arr.length;i++){
           if(elements.contains(arr[i])){
                list.add(arr[i]);
           }
           else{
            elements.add(arr[i]);
            
            
           }
        //   return 0;
        }
        ArrayList<Integer> duplicats= new ArrayList<Integer>(list);
        Collections.sort(duplicats);
        System.out.println(duplicats);
    }
    }
