package com.example.java19.Overloading;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = getInput(sc, "Enter value 1: ");
        String s2 = getInput(sc, "Enter value 2: ");
        String s3 = getInput(sc, "Enter value 3: ");
        
        sc.close();
        double result = addValues(s1, s2);
        System.out.println("The answer is: " + result);
        
        double result2 = addValues(s1, s2, s3);
        System.out.println("The answer for 3 values is: " + result2);
        
        double result3 = addValues(s1, s2, s3, s1, s2, s3);
        System.out.println("The answer for many values is: " + result3);
    }
    
    static String getInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        
        return scanner.nextLine();
    }
    
    static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return result;
    }
    
    static double addValues(String s1, String s2, String s3) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);
        double result = d1 + d2 + d3;
        return result;
    }
    
    // ... signfica que essa função pode receber números infinitos de argumentos do tipo String.
    static double addValues(String ... values) {
        double result = 0;
        for (String value: values) {
            double d = Double.parseDouble(value);
            result += d;
        }
        
        return result;
    }

}
