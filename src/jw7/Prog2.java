package jw7;

import java.util.Scanner;

public class Prog2 {


    public static void main(String[] args) {
        int year,remainder;
        System.out.println("Enter Year");
        Scanner h=new Scanner(System.in);
        year=h.nextInt();
        remainder=year%4;
        if (remainder==0) {
            System.out.println("it is a leap year");
        } else {
            System.out.println("it is not a leap year");
        }


    }}


