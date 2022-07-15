package com.example.java04.Math;

public class Main {

    public static void main(String[] args) {
        int intValue1 = 56;
        int intValue2 = 42;
        
        int result1 = intValue1 + intValue2;
        System.out.println("Addition: " + result1);
        
        int result2 = intValue1 - intValue2;
        System.out.println("Subtraction: " + result2);
        
        int result3 = intValue1 * intValue2;
        System.out.println("Multiplication: " + result3);
        
        // Para uma divisão precisa, tem que ser double, mesmo que estejamos dividindo dois inteiros.
        double result4 = (double) intValue1 / intValue2;
        System.out.println("Division: " + result4);

        int result5 = intValue1 % intValue2;
        System.out.println("Remainder: " + result5);
        
        // Math facilita nossa vida
        double doubleValue = -3.999999;
        long rounded = Math.round(doubleValue);
        System.out.println("Rounded: " + rounded);
        
        double absValue = Math.abs(doubleValue);
        System.out.println("Absolute: " + absValue);
        
        }
}
