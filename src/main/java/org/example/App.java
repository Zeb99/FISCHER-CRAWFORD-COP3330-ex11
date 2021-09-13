package org.example;
import java.util.Scanner;
/**
 * Currency Conversion
 * UCF cop3330 Fall 2021 Assignment 11 Solution
 * Copyright 2021 Zeb Fischer-Crawford
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        int c_from = scan.nextInt();
        System.out.print("What is the exchange rate? ");
        double rate = scan.nextDouble();

        float c_to =(float)(c_from * rate);

        System.out.println(c_from + " euros at an exchnage rate of " + rate + " is " + c_to + " U.S. dollars.");
    }
}
