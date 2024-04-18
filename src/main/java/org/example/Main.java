package org.example;

import entities.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER RECTANGLE WIDHT AND HEIGHT: ");
        rectangle.setWidth(sc.nextDouble());
        rectangle.setHeight(sc.nextDouble());

        System.out.println(rectangle.toString());
    }
}