package com.company;

public class StaticVariable {
    static int x=0;

    StaticVariable(){
        x++;
    }

    void show()
    {
        System.out.println("The value of x is: "+x);
    }

    public static void main(String args[])
    {
      StaticVariable obj=new StaticVariable();
      StaticVariable obj1=new StaticVariable();
      StaticVariable obj2=new StaticVariable();
      StaticVariable obj3=new StaticVariable();
      obj.show();
    }
}
