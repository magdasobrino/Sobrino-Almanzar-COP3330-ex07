/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */

import java.util.Scanner;
public class Exercise07 {

        public static void main(String[] args){
            //variables//
            double conversionFactor = 0.09290304;
            double length = 0, width = 0;
            double squareFeet, squareMeters;
            Scanner scnr = new Scanner(System.in);

            System.out.println("What is the length of the room in feet?");
            length = scnr.nextDouble();
            System.out.println("What is the width of the room in feet?");
            width = scnr.nextDouble();

            squareFeet = length * width;

            squareMeters = squareFeet * conversionFactor;

            System.out.println("The area is");
            System.out.printf("%.0f square feet %n", squareFeet);
            System.out.printf("%.3f square meters %n", squareMeters);

            scnr.close();
            System.exit(0);
        }//end of main

    }//end of program


