package org.academiadecodigo.tropadelete.BuilderPattern;

public class Account {
    private long accountNumber; //This is important, so we'll pass it to the constructor.
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public Account(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account withOwner(String owner) {
        this.owner = owner;
        return this;  //By returning the builder each time, we can create a fluent interface.
    }

    public Account atBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public Account openingBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public Account atRate(double interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    public BankAccount build() {
        //Here we create the actual bank account object
        // which is always in a fully initialised state when it's returned.
        BankAccount account = new BankAccount();
        //the builder is in the BankAccount package, we can invoke its default constructor.

        account.accountNumber = this.accountNumber;
        account.owner = this.owner;
        account.branch = this.branch;
        account.balance = this.balance;
        account.interestRate = this.interestRate;
        return account;
    }

}
