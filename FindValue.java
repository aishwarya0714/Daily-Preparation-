
public class FindValue {
    public static void main(String[] args) {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};

        // join() method is use to concate or join string from array
        String w1 = String.join("", word1);
        String w2 = String.join("", word2);

        // equals() method will be used to comapre strings
        if(w1.equals(w2)){
            System.out.println("True");
        }
       
        
        
    }

}


