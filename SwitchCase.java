package com.company;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        int age;
        System.out.println("Enter your age");
        Scanner Sc=new Scanner(System.in);

        age=Sc.nextInt();

        switch(age){

            case 18:
                System.out.println("you are going to become adult!");
                break;

            case 23:
                System.out.println("you are going to join a job1");
                break;

            case 60:
                System.out.println("you are going to get retaired");
                break;

            default:
                System.out.println("enjoy your life");

        }
    }
}
