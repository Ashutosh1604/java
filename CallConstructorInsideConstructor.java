package com.company;

public class CallConstructorInsideConstructor {

    int x,y;

    CallConstructorInsideConstructor()
    {
          this(4,5);    //it should be in first line of constructor
        System.out.println("Inside the first constructor");
    }

    CallConstructorInsideConstructor(int x, int y)
    {
        System.out.println("Inside the second constructor");
    }

    public static void main(String[] args) {
        CallConstructorInsideConstructor obj= new CallConstructorInsideConstructor();
    }
}
