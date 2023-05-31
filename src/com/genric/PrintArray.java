package com.genric;

public class PrintArray {
    public static void main(String[] args) {
        Integer[] num1 = {3, 4, 5, 6};
        Double[] num2 = {4.3, 4.3, 55.4, 6.32};
        Character[] ch = {'r', 'y', 'u'};
        toprint(num1);
        toprint(ch);
        toprint(num2);
    }
    public static <T> void toprint(T[] array) {
        for (T element : array
        ) {
            System.out.println("Integr value is -->  " + element);
        }
    }
}

