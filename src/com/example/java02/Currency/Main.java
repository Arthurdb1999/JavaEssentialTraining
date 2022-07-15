package com.example.java02.Currency;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        
        double value = .012;
        
        double pSum = value + value + value;
     
        System.out.println("Sum of primitives: " + pSum);
        
        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);
        BigDecimal bigValue = new BigDecimal(strValue);
        
        BigDecimal bigSum = bigValue.add(bigValue).add(bigValue);
        
        System.out.println("Sum of bigDecimals: " + bigSum.toString());
        
    }

}
