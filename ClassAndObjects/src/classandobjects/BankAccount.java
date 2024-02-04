package classandobjects;

import java.util.Random;

public class BankAccount {
    public String name;
    public String id;
    public double balance;

    public BankAccount(){
        id=new Random().nextInt(99999)+"";
    }
    public BankAccount(String name,String id,double balance){
        this.name=name;
        this.id=id;
        this.balance=balance;
    }

    public void deposit(double amount){
        balance=balance+amount;
    }

    public void withdraw(double amount){
        if(amount<balance){
            balance=balance-amount;
        }
        else {
            System.out.println("Taka nai");
        }

    }
}
