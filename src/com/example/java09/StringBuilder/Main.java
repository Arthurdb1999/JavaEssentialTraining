package com.example.java09.StringBuilder;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!";
        System.out.println(str3);

        // No exemplo acima, tivemos que criar 3 objetos para printar uma string. Usando
        // StringBuilder, criamos apenas um objeto.
        StringBuilder sb = new StringBuilder("Hello")
                .append(", ")
                .append("World")
                .append("!");
        System.out.println(sb);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Value: ");
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();
            sb.append(input + "\n");
        }
        
        System.out.println(sb);
    }

}
