package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10: ");
        String input = sc.nextLine();
        int number = Integer.parseInt(input);
        switch (number){
            case 1:
                System.out.println("1 in Spanish is uno.");
                break;
            case 2:
                System.out.println("2 in Spanish is dos.");
                break;
            case 3:
                System.out.println("3 in Spanish is tres.");
                break;
            case 4:
                System.out.println("4 in Spanish is cuatro.");
                break;
            case 5:
                System.out.println("5 in Spanish is cinco.");
                break;
            case 6:
                System.out.println("6 in Spanish is seis.");
                break;
            case 7:
                System.out.println("7 in Spanish is siete.");
                break;
            case 8:
                System.out.println("8 in Spanish is ocho.");
                break;
            case 9:
                System.out.println("9 in Spanish is nueve.");
                break;
            case 10:
                System.out.println("10 in Spanish is diez.");
                break;
            default:
                System.out.println("Invalid entry, please try again.");
        }
    }
}
