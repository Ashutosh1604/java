/*program to find if student is pass or fail if it requires total 40% and at least
 33%  in each subject to pass assume 3 subjects and take marks as input */

package com.company;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        byte m1,m2,m3;
      Scanner Sc=new Scanner(System.in);

        System.out.println("enter marks in physics: ");
        m1=Sc.nextByte();

        System.out.println("enter marks in chem: ");
        m2=Sc.nextByte();

        System.out.println("enter marks in maths: ");
        m3=Sc.nextByte();

        float avg=(m1+m2+m3)/3.0f;

        System.out.println("Overall percentage is :" +avg);

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
        {
            System.out.println("Congratulations!, you are pass");
        }
        else
        {
            System.out.println("Sorry,you are fail");
        }

    }
}
