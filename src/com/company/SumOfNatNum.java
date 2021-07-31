package com.company;
import java.util.*;
public class SumOfNatNum {
    public static void main(String[]args){
        int i,num,sum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n:");
        num = sc.nextInt();
        for(i=1;i<=num;++i) {
            sum = sum + i;
        }
            System.out.println("Sum of n Numbers:" +sum );
        }
    }
