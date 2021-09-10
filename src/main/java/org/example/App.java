package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print( "Enter a noun: " );
        String noun = scanner.nextLine();

        System.out.print( "Enter a verb: " );
        String verb = scanner.nextLine();

        System.out.print( "Enter an adjective: " );
        String adjective = scanner.nextLine();

        System.out.print( "Enter an adverb: " );
        String adverb = scanner.nextLine();

        System.out.printf( "Do you %s your %s %s %s? That's hilarious!%n", verb, adjective, noun, adverb );


    }
}