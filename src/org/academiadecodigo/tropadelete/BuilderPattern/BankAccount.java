package org.academiadecodigo.tropadelete.BuilderPattern;

public class BankAccount {
    long accountNumber; //This is important, so we'll pass it to the constructor.
    String owner;
    String branch;
    double balance;
    double interestRate;

    BankAccount() {

    }

    public String getDetails() {
        return "\n-==-==-==-==-==-==-==-==-==-==-==-==-==-==-\n"
                + "Account number: " + this.accountNumber + "\n"
                + "Owner Name: " + this.owner + "\n"
                + "Branch: " + this.branch + "\n"
                + "Balance: " + this.balance + "\n"
                + "Interest Rate: " + this.interestRate + "\n"
                + "-==-==-==-==-==-==-==-==-==-==-==-==-==-==-";
    }
}
