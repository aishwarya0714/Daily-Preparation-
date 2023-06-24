package ArrayList;
import java.util.ArrayList;

// import javax.sound.sampled.SourceDataLine;
public class PosNegElem {
    public static void main(String[] args){
    int [] arr = {1,-1,3,2,-7,-5,11,6};

    ArrayList<Integer> pos = new ArrayList<>();

    ArrayList<Integer> neg = new ArrayList<Integer>();

    for(int i = 0; i< arr.length;i++){
        if(arr[i]<0){
            neg.add(arr[i]);
        }
        else{
            pos.add(arr[i]);
        }
    }
    pos.addAll(neg);
    for(int i = 0; i<pos.size();i++){
        // int poss = pos.get(i);
        // System.out.print(poss+" ");
        arr[i]=pos.get(i);
        System.out.print(arr[i]+" ");

    }


}
}
