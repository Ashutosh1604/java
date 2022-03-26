/* calculate income tax paid by an employee to government as per the slabs below:-
  income slab       tax
  2.5L-5.0L          5%
  5.0L-10.0L         20%
  above 10.0L        30%

*/

package com.company;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {

        Scanner Sc=new Scanner(System.in);
        float tax=0;
        System.out.println("enter your income in lakh per annum: ");
        float income=Sc.nextFloat();

        if(income>2.5f && income <=5f) {

            tax=tax+ 0.05f * (income -  2.5f);  // 5% of income excluding 2.5 income as there is no tax till 2.5 income

        }
        else if(income>5f && income<=10.0f)
        {
            tax=tax+ 0.05f * (5.0f -  2.5f);  // 5% of income between 5 to 2.5
            tax=tax+ 0.2f * (income -  5.0f);  // 20% of income excluding 5.0 income as it is calculated
        }
        else if(income>10.0f)
        {
            tax=tax+ 0.05f * (5.0f -  2.5f);  // 5% of income between 5 to 2.5
            tax=tax+ 0.2f * (10.0f -  5.0f);  // 20% of income excluding income between 5 and 10
            tax=tax+ 0.3f * (income -  10.0f);  // 30% of income excluding 10 income as it is calculated
        }

        System.out.println("tax paid: "+ tax);
    }
}
