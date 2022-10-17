package jw7;

import java.util.Scanner;

public class Prog6 {

    public static void main(String[] args) {
        int number,reminder;
        System.out.println("please Input a number");
        Scanner h =new Scanner(System.in);
         number=h.nextInt();
         reminder= number%2;
       if(reminder==0)
           System.out.println("Even number");
        else
           System.out.println("Odd number");

    }

}
