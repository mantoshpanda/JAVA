package com.mantosh.variable_declaration;

class Hello1{
    char ch;
    void show(){
        System.out.println(ch == 0);
       // System.out.println(ch == ''); uncommenting this will throw an error empty character literal
        System.out.println(ch == '\u0000');
    }
}

public class Lab2 {
    public static void main(String[] args) {
        Hello1 h=new Hello1();
        h.show();
    }
}