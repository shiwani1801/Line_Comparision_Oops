package com.bridgelabz.linecomparisionoops;

public class Length {
    public static void main(String[] args) {
        CompareLine compare=new CompareLine();
        compare.setX1(2);
        compare.setX2(4);
        compare.setY1(8);
        compare.setY2(2);
        compare.setA1(1);
        compare.setA2(6);
        compare.setB1(6);
        compare.setB2(8);
        System.out.println("the coordinates are=\n"+compare.toString());
        double length1=((compare.getX2()- compare.getX1())^2 + (compare.getY2()- compare.getY1())^2);
        double length2=((compare.getA2()- compare.getA1())^2 + (compare.getB2()- compare.getB1())^2);
        System.out.println("length of first line="+length1 +"\n length of second line = "+length2);

        System.out.println("\n check line equality===> ");
        checkLineEquality( length1, length2);
        System.out.println("\n compare line===> ");
        compareTwoLines(length1, length2);

    }
    public static void checkLineEquality(Double length1, Double length2) {
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

    public static void compareTwoLines(Double length1, Double length2) {
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
