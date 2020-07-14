package Exe_11;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {

    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        System.out.println("1) Triangle ");
        System.out.println("2) Square ");
        System.out.println("3) Rectangle ");
        System.out.println("4) Circle ");

        int type = sc.nextInt();

        switch (type) {
            case 1:
                areaTriangle();
                break;
            case 2:
                areaSquare();
                break;
            case 3:
                areaRectangle();
                break;
            case 4:
                areaCircle();
                break;
            default:
                break;
        }

        sc.close();
    }

    private static void areaTriangle() {

        System.out.println("Enter the side length : ");
        double side = sc.nextDouble();

        System.out.println("Enter the height : ");
        double height = sc.nextDouble();

        double area = 0.5 * (side * height);
        System.out.println(df.format(area));
    }

    private static void areaSquare() {

        System.out.println("Enter the side length : ");
        double side = sc.nextDouble();

        double area = side * side;
        System.out.println(df.format(area));
    }

    private static void areaRectangle() {

        System.out.println("Enter the width : ");
        double width = sc.nextDouble();

        System.out.println("Enter the height : ");
        double height = sc.nextDouble();

        double area = (width * height);
        System.out.println(df.format(area));
    }

    private static void areaCircle() {

        System.out.println("Enter the radius : ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println(df.format(area));
    }

}
