package com.company;
import java.util.Scanner;

public class StudentDetails {

    String name=" ";
    String section;
    int rollNum;

    void setValue(String nme,String Scn,int rn)
    {
     name=nme;
     section=Scn;
     rollNum=rn;




    }

    void show()
    {
        System.out.println("student name: "+ name);
        System.out.println("student section: "+ section);
        System.out.println("student roll number: "+ rollNum);

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
