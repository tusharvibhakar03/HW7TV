package jw7;

import java.util.Scanner;

public class Prog5 {

    public static void main(String[] args) {
        int Salary, HRA,TA,DA,PF,GROSSSALARY;
        System.out.println("--------------------------");
        System.out.println("|      Salary Slip         | ");
        System.out.println("--------------------------");
        Scanner h = new Scanner(System.in);
        System.out.print("Employee id  ");
        int n =h.nextInt();
        System.out.print("Employee Name");
        String m=h.next();
        System.out.print("Enter Basic Salary");
        Salary =h.nextInt();
        HRA =Salary*10/100;
        System.out.println("HRA "+HRA);
        TA =Salary*8/100;
        System.out.println("TA "+TA);
        DA =Salary*9/100;
        System.out.println("DA "+DA);
        PF =Salary*20/100;
        System.out.println("PF "+PF);
        GROSSSALARY=Salary+HRA+TA+DA-PF;
        System.out.println("GROSSSALARY is" +GROSSSALARY);







    }}




