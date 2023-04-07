package com.example.unit.services;

public class calculatorService {

    public static int addTwoNumber(int a , int b)
    {
      return a+b;
    }

    public static int productTwoNumber(int a , int b)
    {
        return a*b;
    }
    public static double divideTwoNumbers(int a , int b)
    {
        return  a/b;
    }

    public static int sumAnyNumbers(int ...numbers)
    {
        int s = 0;
        for(int n : numbers)
        {
            s =s+n;
        }
        return  s;
    }
}
