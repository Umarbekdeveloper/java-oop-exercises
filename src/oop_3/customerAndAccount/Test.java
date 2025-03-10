package oop_3.customerAndAccount;

public class Test {
    public static void main(String[] args) {
        Customer c1 = new Customer(102,"James Bond",'f');
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());
        Account a1 = new Account(101,c1,299.99);
        System.out.println(a1);
        System.out.println("id is: " + a1.getId());
        System.out.println("customer is: " + a1.getCustomer());  // Customer's toString()
        System.out.println("balance is: " + a1.getBalance());
        System.out.println("customer's name is: " + a1.getCustomerName());
        System.out.println("customer's deposit is: " + a1.deposit(100));
        System.out.printf("amount after balance is: %.2f%n", a1.withdraw(100));
    }
}
