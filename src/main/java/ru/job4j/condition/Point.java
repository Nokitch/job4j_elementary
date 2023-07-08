package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = x2 - x1;
        double first = Math.pow(rsl1, 2);
        double rsl2 = y2 - y1;
        double second = Math.pow(rsl2, 2);
        double rsl3 = first + second;
        double rsl = Math.sqrt(rsl3);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(8, 3, 7, 11);
        System.out.println("result (8, 3) to (7, 11) " + result1);
    }
}
