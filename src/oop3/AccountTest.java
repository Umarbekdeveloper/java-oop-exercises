package oop3;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122,20000);

        System.out.println("accaunt1 getMonthlyInterestRate() >>>  " + account.getMonthlyInterestRate());
        System.out.println("accaunt1 getMothlyInterest() >>>  " + account.getMonthlyInterest());
        System.out.println("accaunt1 wihtDraw() >>>  " + account.withdraw(2500));
        System.out.println("accaunt1 deposit() >>> " + account.deposit(3000));
    }
}
