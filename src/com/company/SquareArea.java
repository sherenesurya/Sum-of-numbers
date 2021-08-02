package com.company;
import java.util.*;
public class SquareArea {
    public static void main(String [] args) {
        int side;
        System.out.println("enter number:");
        Scanner s = new Scanner(System.in);
        side = s.nextInt();
        int result = side * side;
        System.out.println(result);
    }
}
