package com.company;
import java.util.Scanner;

public class Bank {

    String name=" ";
    long accNum;
    int balance=500000;

    void insert(String nme,long aNum)
    {
        name=nme;
        accNum=aNum;

    }

    void deposite(int depoMoney)
    {
        balance=balance+depoMoney;
    }

    void withdraw(int wdMoney)
    {
        if(balance<wdMoney)
        {
            System.out.println("Sorry!!! can't withdraw due to low balance ");

        }
        else
        {
            balance=balance-wdMoney;
        }

    }


    void currBalance()
    {
        System.out.println("your current balance is:" + balance );
    }

    void display(int depoMoney,int wdMoney)
    {
        System.out.println("user name: "+name);
        System.out.println("account number: "+accNum);
        System.out.println("Your current balance is: "+balance);
        System.out.println("Your current deposite is: "+depoMoney);
        System.out.println("Your current withdraw is: "+wdMoney);
    }
    public static void main(String[] args) {

         Bank obj=new Bank();    //object creation

         Scanner sc=new Scanner(System.in);    //scanner creation

        //input details
        System.out.println("enter the customer details below");
        System.out.println("enter your name: ");
        String nme=sc.nextLine();
        System.out.println("enter your account number: ");
        long aNum=sc.nextLong();


        obj.insert(nme,aNum);
        obj.currBalance();


        //deposite
        System.out.println("enter the amount you want to deposite");

        int depoMoney=sc.nextInt();
        obj.deposite(depoMoney);
        obj.currBalance();

        //withdraw
        System.out.println("enter the amount you want to withdraw: ");
        int wdMoney=sc.nextInt();
        obj.withdraw(wdMoney);
        obj.currBalance();


        //show details
        System.out.println("your details: ");
        obj.display(depoMoney,wdMoney);






    }
}
