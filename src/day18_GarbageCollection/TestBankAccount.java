package day18_GarbageCollection;

public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount QABank = new BankAccount();
        QABank.setInfo("Quaresma",123456789);
        System.out.println(QABank);
        QABank.deposit(1000);
        QABank.checkBalance();
        QABank.withdraw(700);
        QABank.checkBalance();

        QABank.deposit(-1000);
        QABank.checkBalance();

        QABank.withdraw(5000);
        QABank.checkBalance();

        System.out.println("------------------------------");

        BankAccount account1 = new BankAccount();
        account1.setInfo("Sebastian",789456123);

        BankAccount account2 = new BankAccount();
        account2.setInfo("Muktar",159753654);

        account1.deposit(5000);
        account2.deposit(10000);

        System.out.println(account1);
        System.out.println(account2);

        account1.withdraw(1000);
        System.out.println(account1);
        System.out.println(account2);


    }
}
