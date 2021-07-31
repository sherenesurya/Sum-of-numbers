package com.company;
import java.util.*;

public class SumOfNaturalNumbers {
    public static void main (String []args) {
        int i,num,sum=0;
        Scanner am = new Scanner(System.in);
        System.out.println("sum of numbers from:");
        i = am.nextInt();
        System.out.println("sum upto:");
        num = am.nextInt();
            while(i<=num){
                sum= sum+i;
                ++i;
            }
        System.out.println("Total sum of numbers:" + sum);
    }

}
