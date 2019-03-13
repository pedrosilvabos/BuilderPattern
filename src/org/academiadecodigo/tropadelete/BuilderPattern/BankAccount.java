package org.academiadecodigo.tropadelete.BuilderPattern;
//make everything default so you wont be able to instantiate it
public class BankAccount {
    long accountNumber;
    String owner;
    String branch;
    double balance;
    double interestRate;

    BankAccount() {

    }

    public void getDetails() {
        System.out.println( "\n-==-==-==-==-==-==-==-==-==-==-==-==-==-==-\n"
                + "Account number: " + this.accountNumber + "\n"
                + "Owner Name: " + this.owner + "\n"
                + "Branch: " + this.branch + "\n"
                + "Balance: " + this.balance + "\n"
                + "Interest Rate: " + this.interestRate + "\n"
                + "-==-==-==-==-==-==-==-==-==-==-==-==-==-==-"
        );
    }
}
