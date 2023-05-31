package com.genric;

public class PrintArray {
    public static void main(String[] args) {
        int  [] num1={3,4,5,6};
        double[] num2={4.3,4.3,55.4,6.32};
        char[] ch={'r','y','u'};
        printarray(num1);
        printarray(num2);
        printarray(ch);
    }
    public static void printarray(int []array){
        for (int element: array
             ) {
            System.out.println("Integr value is -->  "+element);

        }
    }
    public static void printarray(double []array){
        for (double element: array
        ) {
            System.out.println("Double value is --> "+element);

        }
    }

    public static void printarray(char []array){
        for (char element: array
        ) {
            System.out.println("character  is -->  "+element);

        }
    }
}

