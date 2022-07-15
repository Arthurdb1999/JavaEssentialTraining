package com.example.java01.PrimitiveNumbers;

public class MaxValues {

    public static void main(String[] args) {
        
        byte b = 127;
        System.out.println("Byte: " + b);
        
        // Se somar 1, b vai passar a valer -128, que é o valor mínimo de byte.
        if (b < Byte.MAX_VALUE) {
            b++;
        }
        
        System.out.println("Byte: " + b);
    }

}
