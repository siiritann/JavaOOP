import java.util.ArrayList;

public class BankAccount {

    String account;
    double balance;
    ArrayList<String> bankAccounts = new ArrayList<String>();

    // Constructors

    BankAccount(){
        account = "";
        balance = 0;
    }

    BankAccount(String account, double balance){
        this.account = account;
        this.balance = balance;
    }
}
