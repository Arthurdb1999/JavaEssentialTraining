package com.example.java01.PrimitiveNumbers;

public class Main {

    public static void main(String[] args) {
        byte b = 1;
        short sh = 1;
        int i = 1;
        // A unidade padrão para inteiros é int. O compilador só vai assumir que é um long caso
        // ultrapasse o máximo de int (2bi).
        // Para isso não acontecer, adicionamos o L no final, indicando que queremos que o
        // compilador entenda o 1 como long e não como int.
        // A mesma lógica se aplica para float e double.
        long l = 1L;

        float f = 1f;
        double d = 1d;

        System.out.println("Byte: " + b);
        System.out.println("Short: " + sh);
        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
    }
}
