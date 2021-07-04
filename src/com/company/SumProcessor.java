package com.company;

public class SumProcessor {
    public static int addtwonum(int a,int b) {
       int sum = a+b;
        return sum;
    }

    public static int addthreenum(int a,int b,int c) {
        int sum = a+b+c ;
        return sum ;
    }
  public static int addtenNum(int n[]) {

        int i = 0;int result =0;
        while(i < 10) {
            result = result + n[i];
            i++;

        }

      return result;
      }


}
