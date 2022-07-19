package com.example.java20.SimpleArrays;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        
        // Não pode mudar seu tamanho, seja diminuir ou aumentar. Mas pode mudar o valor de cada posição.
        System.out.println("Array of primitives");
        int[] ints = {9, 6, 3};
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        
        System.out.println("Array of strings");
        String[] strings = {"Red", "Green", "Blue"};
        Arrays.sort(strings);
        for (String color : strings) {
            System.out.println(color);
        }
        
        // Estamos criando um array de tamanho 10, cujas posição vão ser preenchidas com o valor default de cada tipo de dado,
        // no caso de inteiros, 0. Se fosse boolean, false.
        System.out.println("Setting and initial size");
        int[] sized = new int[10];
        for (int i = 0; i < sized.length; i++) {
            sized[i] = i * 100;
        }
        for (int value: sized) {
            System.out.println(value);
        }
        
        System.out.println("Copying an Array");
        int[] copied = new int[5];
        System.arraycopy(sized, 5, copied, 0, 5);
        for (int value : copied) {
            System.out.println(value);
        }
    }

}
