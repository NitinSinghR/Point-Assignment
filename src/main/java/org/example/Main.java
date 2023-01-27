package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the x value:");
        int x = sc.nextInt();
        System.out.println("Enter the y value:");
        int  y = sc.nextInt();

        Point p1=new Point(x,y);
        System.out.println(p1.equals(x,y));

        Point p2=(Point)p1.clone();
    }
}
class Point extends Main implements Cloneable{
    private int x1;
    private int y1;
    Point(int x,int y) {
        this.x1 = x;
        this.y1 = y;
    }

    public String equals(int x,int y) {
        if (x1 == y1) {
            return "true";
        } else {
            return "false";
        }
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}