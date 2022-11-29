package com.bridgelabz.linecomparisionoops;

import java.util.Scanner;

public class CompareLine {
    public static void main(String args[]) {

        System.out.println("Welcome to Line Comparison Computation");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter points of First line");
        System.out.println("Enter coordinates of first point x1 y1 : ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter coordinates of second point x2s y2 : ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        Double length1 = (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
        System.out.printf("length of first line is = "+length1);


        System.out.println("Enter points of second line : ");
        System.out.println("Enter coordinates of first point a1 b1 : ");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        System.out.println("Enter coordinates of second point a2 b2 : ");
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        scanner.close();
        Double length2 = (Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1)));
        System.out.printf("length of second line is =   "+length2);

        compareTwoLines(length1, length2);
        checkLineEquality(length1, length2);

    }

    private static void checkLineEquality(Double length1, Double length2) {
        boolean x = (length1.equals(length2));
        if (x)
        {
            System.out.println("Length of two lines are equal");
        }
        else
        {
            System.out.println("Length of two lines are not equal");
        }
    }

    private static void compareTwoLines(Double length1, Double length2) {
        int x = (length1.compareTo(length2));
        if (x > 0)
        {
            System.out.println(" length of Line1 is greater than line2");
        }
        else if (x < 0)
        {
            System.out.println("length line2 is greater than line1");
        }
        else
        {
            System.out.println("length of two lines are equal");
        }
    }

}

