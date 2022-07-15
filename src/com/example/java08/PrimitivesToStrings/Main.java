package com.example.java08.PrimitivesToStrings;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);
        
        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);
        
        // Botar _ em longs é apenas uma convenção para deixar grandes números mais legíveis.
        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);
    }

}
