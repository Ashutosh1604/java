package com.company;

public class letter {

    public static void main(String[] args) {

        String text="Dear <|name|> ,Thanks a lot!";

        text=text.replace("<|name|>","Ashutosh");
        System.out.println(text);
    }
}
