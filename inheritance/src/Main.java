import java.util.Date;

public class Main {
    public static void main (String [] args) {

        CheckingAccount newCheckingAccount = new CheckingAccount(); // this is creating instance = objekti loomine
        newCheckingAccount.account = "9000";
        newCheckingAccount.balance = 200;
        newCheckingAccount.limit = 4567;

        SavingsAccount newSavingsAccount = new SavingsAccount();
        newSavingsAccount.account = "9000";
        newSavingsAccount.balance = 200;
        newSavingsAccount.Transfers = 7;

        CertificateOfDeposit newCOD = new CertificateOfDeposit();
        newCOD.account = "9000";
        newCOD.balance = 200;
        newCOD.expiryDate = new Date("2020-01-01");

    }
}
