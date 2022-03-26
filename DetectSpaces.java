//program to detect double and triple spaces in string and return -1 if not
package com.company;

public class DetectSpaces {
    public static void main(String[] args) {
        String myString="This string contain  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
    }
}
