package com.company;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
//import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //String message = "AAAA \"BBBB\"";//Escape chars..... my bitch ass one liners at work xD
        //String message = "c:\\Windows\\.."; // escape with another \ and add a \n to escape with a new line
        // System.out.println(message);
        //ARAYYS
        //int[] numbers = new int[5];// refrence so would need new and also 5 is the size of the array int is the type of stuff in the array
        //numbers[0] = 1;//set each index with a number and we know that the array is max at size 5
        //numbers[1] = 2;
        //System.out.println(numbers);// this will print addr in memory of the array
        //int[] numbers = { 2, 3, 5, 1, 4 };
        //System.out.println(numbers.length);//will show size of array
        //Arrays.sort(numbers);
        //System.out.println(Arrays.toString(numbers));//Arrays is a class that will help printing the stuff in the INT Array... make sure you initialize correct Array toString
        //MultiDimension ARRAY!!
        //int[][] numbers = new int[2][3];// 2 rows and 3 columns
        //int [][] numbers = { { 1, 2, 3}, { 4, 5, 6} };// Same thing with Row and Column setup Each row is an array
        //numbers[0][0] = 1;//set 1st row 1st column as 1
        //System.out.println(Arrays.deepToString(numbers));//deepToString is for multi D Array

        // CONSTANT VARIABLE VALUE and MATH!!!
        //final float  PI = 3.14F;// IT WILL NEVER CHANGE VALUE and using capital letters
        //double result = (double)10 / (double)3;//must set numbers as DOUBLE so we can get decimal in value
        int x = 1;
        //int y = x++;//++x first X will be 2 then Y will be 2
        //x++;// OR like ++x
        //x = x + 2;
        x += 2;//adds 2 same as before
        System.out.println(x);

    }
}
