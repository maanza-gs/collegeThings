package com.company;
import java.lang.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account a = new Account("14987MA", 100000);
        Customer c = new Customer(a, "Mac", "Chennai", "260602", "197AG SJK26", 1972);

        c.printDetails();
        a.createTransaction();

        ATM atm[] = new ATM[2];
        atm[0].location = "T Nagar";
        atm[0].managedBy = "ABC";
        atm[1].location = "R A Puram";
        atm[1].managedBy = "DEF";

        Bank b = new Bank(atm);
        b.bankDetails();

    }
}

class Account{
    public String type;
    public String accountNo;
    public float balance;

    Account(){
           accountNo = "";
           balance = 0;
    }

    Account(String n, float b){
        this.accountNo = n;
        this.balance = b;
    }

    Account(Account b){
        this.accountNo = b.accountNo;
        this.balance = b.balance;
    }

    private void deposit(float amt){
        System.out.print("Amount: " + amt + " has been deposited.");
        balance += amt;
        System.out.print("Current balance: " + this.balance);
    }

    public void withdraw(float amt){
        if (amt<=balance){
            System.out.print("Amount: " + amt + " has been withdrawn.");
            balance -= amt;
            System.out.print("Current balance: " + this.balance);
        }
        else
            System.out.print("Amount exceeded balance. Withdrawal failure.");
    }

    public void createTransaction(){
        System.out.print("Choose Transaction: \n1. Deposit\n2. Withdrawal");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.print("Enter amount for deposit");
                float amt1 = sc.nextInt();
                deposit(amt1);
                break;

            case 2:
                System.out.print("Enter amount for withdrawal");
                float amt2 = sc.nextInt();
                withdraw(amt2);
                break;

            default:
                System.out.print("Invalid Choice!\n");
        }
    }

    public void printDetails(){
        System.out.print("\nAccount Number: " + accountNo);
        System.out.print("\nCurrent Balance: " + balance);
    }

}

class CurrentAccount extends Account{
    CurrentAccount(){
        super();
        super.type = "Current Account";
    }
}

class SavingsAccount extends Account{
    SavingsAccount(){
        super();
        super.type = "Savings Account";
    }
}

class Customer{
    public Account a = new Account();
    public String Name;
    public String Address;
    public String dob;
    private String cardNo;
    private int pin;

    Customer(){
        a = new Account();
        Name = "";
        Address = "";
        dob = "";
        cardNo = "";
        pin = 0;
    }

    Customer(Account acc, String n, String ad, String dob, String card, int pin){
        a = new Account(acc);
        Name = n;
        Address = ad;
        this.dob = dob;
        cardNo = card;
        this.pin = pin;
    }

    public boolean verifyPassword(int pin){
        int flag = 0;
        if (this.pin == pin){
            a.createTransaction();
        }
        else
            flag = 1;

        if (flag==1){
            return false;
        }
        else
            return true;
    }

    public void printDetails(){
        System.out.print("Customer Name: " + this.Name);
        System.out.print("\nAddress: " + this.Address);
        System.out.print("\nDOB " + this.dob);
        System.out.print("\nCard Number: " + this.cardNo);
        a.printDetails();
    }
}

class Bank{
    public String code;
    public String address;
    ATM[] a = new ATM[2];

    Bank (ATM[] at){
        for(int i=0;i<2;i++){
            a[i].location = at[i].location;
            a[i].managedBy = at[i].managedBy;
        }
    }

    public void manages(){
        ATM[] a = new ATM[2];
    }

    public void maintains(){
        Account acc;
    }

    public void bankDetails(){
        for(int i=0;i<2;i++){
            System.out.print("ATM location: "+a[i].location+" Managed By: "+a[i].managedBy+"\n");
        }
    }
}

class ATM extends ATMtransaction{
    public String location;
    public String managedBy;

    ATM(String l, String m){
        location = l;
        managedBy = m;
    }

    public void identifies(){

    }

    public void transactions(){
        modifies();
    }
}

class ATMtransaction extends Account{
    public String transId;
    public String Date;
    public String type;
    public float amount;
    public float postBalance;

    ATMtransaction(){
        transId="";
        Date = "";
        type = "";
        amount = 0;
        postBalance = 0;
    }

    public void modifies(){
        createTransaction();
    }
}