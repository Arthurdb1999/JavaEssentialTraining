package com.example.java03.ConvertingNumbers;

public class Main {

    public static void main(String[] args) {
        
        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The 2nd value is " + intValue2);
        
        // Se eu quiser converter para um tipo maior, chamamos de widening the type. É automático e sem riscos;
        // Se eu quiser converter para um tipo menor, chamamos de narrowing the type. Precisa realizar cast e corre-se o risco de perder dados;
        
        long longValue1 = intValue1;
        System.out.println("The long value is " + longValue1);
        
        short shortValue1 = (short) intValue1;
        System.out.println("The short value is " + shortValue1);
        
        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;
        System.out.println("The byte value is " + byteValue);
        
        double doubleValue = 3.9999999d;
        int intValue4 = (int) doubleValue;
        System.out.println("Double to int is " + intValue4);
    }

}
