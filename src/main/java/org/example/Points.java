package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class Points {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        Logger l= Logger.getLogger("com.api.jar");

        l.info("Enter the x value:");
        int x = sc.nextInt();
        l.info("Enter the y value:");
        int  y = sc.nextInt();
        Point p=new Point(x,y);

        Point p1=(Point)p.clone();
        l.info("Enter the x value:");
        int x1 = sc.nextInt();
        l.info("Enter the y value:");
        int  y1 = sc.nextInt();

        String e=p1.equals(x1,y1);
        l.info(e);
    }
}
