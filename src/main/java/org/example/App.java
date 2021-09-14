package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int month;
        String final_answer;
        String num_to_name;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        month = input.nextInt();

        switch (month)
        {
            case 1:  num_to_name = "The name of the month is January.";
                break;

            case 2:  num_to_name = "The name of the month is February.";
                break;

            case 3:  num_to_name = "The name of the month is March.";
                break;

            case 4:  num_to_name = "The name of the month is April.";
                break;

            case 5:  num_to_name = "The name of the month is May.";
                break;

            case 6:  num_to_name = "The name of the month is June.";
                break;

            case 7:  num_to_name = "The name of the month is July.";
                break;

            case 8:  num_to_name = "The name of the month is August.";
                break;

            case 9:  num_to_name = "The name of the month is September.";
                break;

            case 10: num_to_name = "The name of the month is October.";
                break;

            case 11: num_to_name = "The name of the month is November.";
                break;

            case 12: num_to_name = "The name of the month is December.";
                break;

            default: num_to_name = "Error: Cannot be converted to month.";
                break;

        }

        System.out.print(num_to_name);

    }

}