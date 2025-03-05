package oop3;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    Account(){
        this.id = 0;
        this.balance =0;
        this.annualInterestRate =0;
    }

    Account(int id, double balance){
        this.id=id;
        this.balance=balance;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }

    double getMonthlyInterest() {
        return balance * (annualInterestRate/12);
    }

    double withdraw(double amount) {
        return balance - amount;
    }

    double deposit(double amount) {
        return balance + amount;
    }
}