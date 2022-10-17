package jw7;

import java.util.Scanner;

public class Prog7 {

    public static void main(String[] args) {
        int Amount, Salary, Commission;
        Scanner h = new Scanner(System.in);
        System.out.print("Sales id  ");
        int n = h.nextInt();
        System.out.print("Seller's Name");
        String m = h.next();
        System.out.print("Sales Amount");
        Amount = h.nextInt();
        if (Amount >= 50000) {
            System.out.println("Commission 35%");
        }

        { if (Amount <= 30000)
                System.out.println("Commission 20%");}
        {      if (Amount <= 20000)
                    System.out.println("Commission 10%");}
        {
                    if (Amount <= 10000)
                        System.out.println("Commission 2%");}










                    }


    }