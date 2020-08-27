package com.company;

import java.awt.*;
//import java.util.Date;

public class Main {

    public static void main(String[] args) { /*
        void means function won't return a value
        int myAge = 30;// saving a variable and only store whole numbers
        int herAge = myAge; // takes the value from the top
        System.out.println(herAge); //this will print the value of myAge

        //TYPES
        //PREMITIVE
        byte age = 30;
        int viewsCount = 123_456_789; // can separate with _ instead of comma make it more readable
        long viewsCounter = 3_123_456_789L;// using L as a suffix since Java com reads nums as interger by default
        float price = 10.99F; // using suffix F to show java its a Float... again by default it reads the double
        char letter = 'A';// char is one letter, STR is group of letters
        boolean isEligible = true;
        // REFERENCE
        */
        /* byte age = 30;
        Date now = new Date(); /* Alt+Enter will show what package the class is in and once chosen IntelliJ will import automatically
        with refrence type we have to allocate memory with "new"  so "new Date" will be an instance of new
        now.getTime()  This has members when type new and you will see a list to choose from
        System.out.println(now); // sout + TAB will type this out for you and this will print out current time and date */

        /* byte x = 1;
        byte y = x;
        x = 2;  // x and y are completely independent even if we change value of x
        System.out.println(y); */

       // Point point1 = new Point(1,1); // refrence type will store memory location of the addr and not the obj value
       // Point point2 = point1; // point2 calls the memory location of point1
        // point1.x = 2;
        //System.out.println(point2);

        String message = ("AAAAAAAAA" + "!@#!@#!"); // Strings are refrence types
        //System.out.println(message.length());//methods which also has startsWith() and length to check size for like pw or something
        //System.out.println(message.indexOf("!")); // shows where the char is in a str
        //System.out.println(message.replace("!", "*"));// pretty much replacment!!! and not modify original
        


    }
}
