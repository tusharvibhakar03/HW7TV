package jw7;

public class Prog19 {
    public static void main(String[] args) {

        int[] numbers = new int[]{8, 17, 37, 46, 92, -106, 304};
        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);







    }}
