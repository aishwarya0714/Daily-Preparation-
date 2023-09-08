package HashSet;

import java.util.HashSet;

public class fstReptElm {

    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int[] arr = { 7, 4, 0, 9, 4, 8, 8, 2, 4, 5, 5, 1 };
        
        Solution obj = new Solution();
        System.out.println(obj.firstRepeated(arr));

        
    }
    
    
}

class Solution {
        // Function to return the position of the first repeating element.
        public int firstRepeated(int[] arr) {
            // Your code here
            
      
          HashSet<Integer> allElm = new HashSet<Integer>();
          HashSet<Integer> dupElm = new HashSet<Integer>();
          
          for(int i=0;i<arr.length;i++){
           
              if(!allElm.contains(arr[i])){
                  allElm.add(arr[i]);
              }
              else{
                  dupElm.add(arr[i]);
              }
          }
         
          if(!dupElm.isEmpty()){
          for(int j = 0;j<arr.length;j++){
              
              if(dupElm.contains(arr[j])){
                  return j+1;
                  
              }
               }
          }
          else{
              return -1;
              }
              
          return 0;
        }
    }