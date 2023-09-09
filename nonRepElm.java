package HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;



public class nonRepElm {
    public static void main(String[] args){
    int[] arr = {1,2,2,1,3};
    Check ck = new Check();
    System.out.println(ck.firstNonRepeating(arr));
    }
}


//User function Template for Java

class Check{
    
    public int firstNonRepeating(int arr[]) 
    { 
        // Complete the function
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i =0 ;i<arr.length;i++){
            int val=1;
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                map.put(arr[i],val);
            }
            else{
                map.put(arr[i],val+1);
            }
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                set2.add(e.getKey());
            }
        }
        for(int j =0; j<arr.length;j++){
            if(set2.contains(arr[j]))
            return arr[j];
        }
        return 0;
    }  
    
}