package jw7;

import java.util.Objects;
import java.util.Scanner;

public class Prog8 {
    public static void main(String[] args) {
        Scanner city = new Scanner(System.in);
        System.out.println("Write first letter of city from (A to F only)");
        String a = city.nextLine();
        if (Objects.equals(a.toUpperCase(), "A")) {
            System.out.println("City is Agra");
        } else if (Objects.equals(a.toUpperCase(), "B")) {
            System.out.println("City is Bharuch");
        } else if (Objects.equals(a.toUpperCase(), "C")) {
            System.out.println("City is Calcutta");
        } else if (Objects.equals(a.toUpperCase(), "D")) {
            System.out.println("City is Doha");
        } else if (Objects.equals(a.toUpperCase(), "E")) {
            System.out.println("City is Edenburgh");
        } else if (Objects.equals(a.toUpperCase(), "F")) {
            System.out.println("City is Frankfurt");
        } else {
            System.out.println("Error: Invalid Entry");
        }




        }













    }




