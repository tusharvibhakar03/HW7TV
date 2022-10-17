package jw7;

import java.util.Scanner;

public class Prog9 {
    public static void main(String[] args) {

        Scanner letter = new Scanner(System.in);
        String a = letter.nextLine();

        switch (a.toUpperCase()){
            case "A":
                System.out.println("City is Agra");
                break;
            case "B":
                System.out.println("City is Bharuch");
                break;
            case "C":
                System.out.println("City is Calcutta");
                break;
            case "D":
                System.out.println("City is Doha");
                break;
            case "E":
                System.out.println("city is Edomburgh");
                break;
            case"F":
                System.out.println("City is Frankfurt");

            default:
                System.out.println("Error: Invalid entry");
















        }}

}
