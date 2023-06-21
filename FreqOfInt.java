import java.util.Scanner;


    

public class FreqOfInt {

    static int findFreq(int[] arr, int number){
        int frq = 0;
        for(int i = 0; i <arr.length;i++){
            if(arr[i] == number){
                frq++;
            }
        }
        return frq;
    }
    public static void main(String[] args){
        int[] arr = {4,3,3,1,3,2,3};
        
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

       
        System.out.println("frequency of "+number+" is: "+ findFreq(arr, number));

    }
}
