/*
Rock->0
Paper->1
Scissor->2
 */

package com.company;

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 for Rock , 1 for Paper , 2 for Scissor");

        int user=sc.nextInt();

        Random random=new Random();
        int computer=random.nextInt(3);

        //draw condition
        if(user==computer)
        {
            System.out.println("Draw");
        }
        //winning condition
        else if(user==0 && computer==2 || user==1 && computer==0 || user==2 && computer==1 )
        {
            System.out.println("you win!!");
        }
        else
        {
            System.out.println("you lose!!");
        }

        //to show computer choice
        if(computer==0)
        {
            System.out.println("computer choice: Rock");
        }
        else if(computer==1)
        {
            System.out.println("computer choice: Paper");
        }
        else
        {

                System.out.println("computer choice: Scissors");

        }

    }
}
