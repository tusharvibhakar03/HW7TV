package jw7;

import java.util.Arrays;

public class Prog17 {

            public static void  main(String[] args){

            int[] my_array1 = {
                    1234, 150, 1920, 1594, 5246,
                    4262, 4265, 4255, 9253, 9486,
                    4708 };

            String[] my_array2 = {
                    "TUSHAR",
                    "SAWAN",
                    "VIMAL",
                    "NEHAL",

                                 };
            System.out.println("Original numeric array : "+ Arrays.toString(my_array1));
            Arrays.sort(my_array1);
            System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));

            System.out.println("Original string array : "+Arrays.toString(my_array2));
            Arrays.sort(my_array2);
            System.out.println("Sorted string array : "+Arrays.toString(my_array2));






}}
