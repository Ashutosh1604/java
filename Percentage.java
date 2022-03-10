package com.company;
import java.util.Scanner;

public class Percentage {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total marks of the subjects: ");
        int total_marks=sc.nextInt();

        System.out.println("Enter marks of subject 1: ");
        float s1=sc.nextFloat();
        System.out.println("Enter marks of subject 2: ");
        float s2=sc.nextFloat();
        System.out.println("Enter marks of subject 3: ");
        float s3=sc.nextFloat();
        System.out.println("Enter marks of subject 4: ");
        float s4=sc.nextFloat();
        System.out.println("Enter marks of subject 5: ");
        float s5=sc.nextFloat();

        float p=(s1+s2+s3+s4+s5)*100/(5*total_marks) ;

        System.out.println("your percentage is: "+ p +"%");
    }



}
