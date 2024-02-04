package classandobjects;

public class TestBankAccount {
    public static void main(String[] args){
        BankAccount account=new BankAccount();

        account.name="Rashid";
//        account.id="10004";
        account.balance=0;

        System.out.println("Balance before deposit "+account.balance );
        account.deposit(1000);
        System.out.println("Balance after deposit "+account.balance );
        account.withdraw(500);
        System.out.println("Balance after withdraw "+account.balance );
        System.out.println("Id "+account.id);

        BankAccount a=new BankAccount("Rahim", account.id, 1000.00);
        System.out.println("Name "+a.name );
        System.out.println("Id "+a.id);
        System.out.println("Balance "+a.balance);
    }

}
