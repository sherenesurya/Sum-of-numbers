package com.company;
import java.util.*;
public class SumTwoNum {
    public static void main(String [] args) {
    char ch;int x=10;
    do {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();

        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
          do {
            System.out.println("select 1 to add numbers or select 2 to subtract numbers");
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println(num1 + num2);
            } else if (n == 2) {
                System.out.println(num1 - num2);
            }
            System.out.println("do you want to continue again?, y or n");
            ch = sc.next().charAt(0);
          } while (ch == 'Y' || ch == 'y');

        System.out.println("select zero to exit");
        x = sc.nextInt();
    } while(x!=0);
    }

}
