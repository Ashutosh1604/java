package com.company;
import java.util.Scanner;

public class StudentDetails {

    String name=" ";
    String section;
    int rollNum;
    static String univ ="gehu";

    void setValue(String name,String Section,int rollNum)
    {
     this.name=name;
     this.section=Section;
     this.rollNum=rollNum;

    }

    void show()
    {
        System.out.println("student name: "+ this.name);
        System.out.println("student section: "+ this.section);
        System.out.println("student roll number: "+ this.rollNum);
        System.out.println("student campus is: "+ this.univ);

    }

    public static void main(String args[])
    {


    StudentDetails obj=new StudentDetails();

        System.out.println("enter student details ");
        //input details
        Scanner sc=new Scanner(System.in);
        System.out.print("enter student name: ");
        String nme=sc.nextLine();

        System.out.print("enter student section: ");
        String Scn=sc.next();

        System.out.print("enter student roll number: ");
        int rn=sc.nextInt();
        //call set value function
        obj.setValue(nme,Scn,rn);

        //call show function
        System.out.println("student details ");
        obj.show();

    }
}
