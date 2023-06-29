package Array;

public class CmnElmFrm3Arr {
    
    public static void main(String[] args){
        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};

        for(int i = 0 ; i < A.length;i++){
            for(int j =0;j<B.length;j++){
                for(int x = 0; x<C.length;x++){
                    if(A[i]==B[j]){
                         int elm = A[i];
                         if(elm == C[x]){
                            System.out.println(elm);
                         }
                    }
                 }
            }
        }

    }
}
