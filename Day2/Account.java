package Inheritance;
import java.util.*;
class Account {
    private String accno;
    private int balance;
    public Account(String accno, int balance) {
        this.accno = accno;
        this.balance = balance;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int depositamt){
        balance+=depositamt;
        System.out.println("The balance amt :"+balance);
    }
    public void withdraw(int withdrawamt){
        if(balance-withdrawamt>0){
            balance=balance-withdrawamt;
            System.out.println("The balance amt :"+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
public class Accounts {
 public static void main(String[]args){
     Account acc=new Account("ABX1234",50000);
     acc.withdraw(51000);
     acc.deposit(1000);
     acc.withdraw(2000);
 }
}


