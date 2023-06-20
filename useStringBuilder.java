public class useStringBuilder {
    public static void main(String[] args){
        // declare our string
        String str= "Aishwarya";

// StringBuilder is used to build and manipulate the string
// create new string with StringBuilder so we can manipulate oyr original dtring and append the reverse of string in newStr

        StringBuilder newStr =  new StringBuilder();

        for (int i = str.length() -1;i>=0;i--){

            // charAt - returns the char value at the specify index

            newStr.append(str.charAt(i));
        }
        
        //toString -  Returns a string containing the characters in this sequence in the same order as this sequence.
        
        System.out.println(newStr.toString());
    }
}

/*
 ==========================Topic Learnt========================
                    ****** StringBuilder *******

    it is used to build and manipulate the string

    -charAt - returns the char value at the specify index

    -toString -  Returns a string containing the characters in this sequence in the same order as this sequence.

 */
