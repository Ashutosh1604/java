package com.company;
import java.util.Scanner;

public class InputIsIntOrNot {

    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);

        System.out.println("enter something");
      boolean b1=sc.hasNextInt();
        System.out.println(b1);
    }
}
