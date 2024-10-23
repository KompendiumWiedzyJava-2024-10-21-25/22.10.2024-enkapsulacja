package com.comarch.szkolenia.enkapsulacja.porownywanie;

import com.comarch.szkolenia.enkapsulacja.modyfikatory.Square;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println(a == b);

        Square s1 = new Square(5);
        Square s2 = new Square(5);

        System.out.println(s1.equals(s2));

        String x1 = "ABC";
        String x2 = "ABC";

        System.out.println(x1);
        System.out.println(x2);

        x1 = x1+"XYZ";

        System.out.println(x1);
        System.out.println(x2);

        System.out.println(x1.equals(x2));
    }
}
