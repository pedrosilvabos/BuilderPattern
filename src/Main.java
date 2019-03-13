import org.academiadecodigo.tropadelete.BuilderPattern.BankAccount;
import org.academiadecodigo.tropadelete.BuilderPattern.Account;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new Account(1234L)
                .withOwner("Pedro")
                .atBranch("Boston MA USA")
                .openingBalance(100)
                .atRate(2.5)
                .build();

        BankAccount anotherAccount = new Account(4567L)
                .withOwner("Joao Vieira")
                .atBranch("Tokio JP")
                .openingBalance(100)
                .atRate(2.5)
                .build();

       account.getDetails();
       anotherAccount.getDetails();
    }
}
