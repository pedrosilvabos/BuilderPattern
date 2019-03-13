import org.academiadecodigo.tropadelete.BuilderPattern.BankAccount;
import org.academiadecodigo.tropadelete.BuilderPattern.Builder;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new Builder(1234L)
                .withOwner("Pedro")
                .atBranch("Boston MA USA")
                .openingBalance(100)
                .atRate(2.5)
                .build();

        BankAccount anotherAccount = new Builder(4567L)
                .withOwner("Joao Vieira")
                .atBranch("Tokio JP")
                .openingBalance(100)
                .atRate(2.5)
                .build();

        System.out.println(account.getDetails());
        System.out.println(anotherAccount.getDetails());
    }
}
