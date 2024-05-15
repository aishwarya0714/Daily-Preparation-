import java.util.Scanner;

class Account{
    // take balance varible to store acc balance
    int bal;

    // create constructor of Account class to take balance
    Account(int b){
        bal = b;
    }

    // create a function to check balance
    boolean isSufficientBal(int w){
        if(bal>w){
            return true;
        }
        else{
            return false;
        }
    }
    // cretae another funvtion to store withrow amount and balance after withdrawale
    void  withdraw(int amt,String name){
        bal = bal - amt;
        System.out.println(name+" Transaction Successful");
        System.out.println(name+" Current balance "+bal);
    }
}

class Customer implements Runnable
{
    String name;
    Account acc;
    
    Customer(Account a,String s){
        acc=a;
        name = s;
    }
    public void run(){
        Scanner s1 = new Scanner(System.in);
        synchronized(acc)
        {
        System.out.println( "Enter the amount to withdraw for "+name+":");
        int amt = s1.nextInt();
        if(acc.isSufficientBal(amt)){
            acc.withdraw(amt,name);
        }
        else{
            System.out.println("insufficient balance");
        }
    }
    }
}


public class ThreadSyn {
    public static void main(String[] args) {
        Account a1 = new Account(5000);
        Customer c1 = new Customer(a1,"aish");
        Customer c2= new Customer(a1,"sush");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
