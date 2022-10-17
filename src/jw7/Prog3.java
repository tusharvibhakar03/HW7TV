package jw7;

import java.util.Scanner;

public class Prog3 {


    public static void main(String[] args) {

        System.out.println("--------------------------");
        System.out.println("|      Mark Sheet         | ");
        Scanner h = new Scanner(System.in);
        System.out.print("|Name:     ");
        String n = h.next();
        System.out.print("Enter roll no of student: ");
        int r = h.nextInt();
        System.out.print("Enter marks in Maths subject: |");
        int m1 = h.nextInt();
        if (m1 < 0) {
            System.out.println("Result invalid");
            if (m1 > 100) {
                System.out.println("Result invalid");
            }
        } else
            System.out.print("Enter marks in  Science subject: |");
        int m2 = h.nextInt();
        if (0 < m2 && m2 > 100)
            System.out.println("Result invalid");
        System.out.print("Enter marks in English  subject: |");
        int m3 = h.nextInt();
        if (0 < m3 && m3 > 100)
            System.out.println("Result invalid");
        int Total = (m1 + m2 + m3);
        System.out.println("Total" + Total);
        double percentage = (Total / 3);
        System.out.println("Percentage" + percentage);

        String g = h.nextLine();
        if (percentage >= 80)
            System.out.println("Grade A+");
        if (percentage>=60)
            System.out.println("Grade A");
        if (percentage <= 50)
            System.out.println("Grade B");
        if (percentage <= 35)
            System.out.println("Grade C");
    }
}















