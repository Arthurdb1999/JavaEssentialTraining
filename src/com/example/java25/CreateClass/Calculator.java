package com.example.java25.CreateClass;

import java.util.Scanner;

import com.example.java25.CreateClass.utilities.MathHelper;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calculate();

    }

    protected void calculate() {
        Scanner sc = new Scanner(System.in);

        InputHelper helper = new InputHelper();
        String s1 = helper.getInput(sc, "Enter a numeric value: ");
        String s2 = helper.getInput(sc, "Enter a numeric value: ");
        String op = helper.getInput(sc, "Choose an operation (+ - * /): ");

        sc.close();
        double result = 0;

        try {
            switch (op) {
            case "+":
                result = MathHelper.addValues(s1, s2);
                break;
            case "-":
                result = MathHelper.subtractValues(s1, s2);
                break;
            case "*":
                result = MathHelper.multiplyValues(s1, s2);
                break;
            case "/":
                result = MathHelper.divideValues(s1, s2);
                break;
            default:
                System.out.println("Unrecognized operation!");
                return;
            }

            System.out.println("The answer is " + result);
        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }

    class InputHelper {

        private String getInput(Scanner scanner, String prompt) {
            System.out.println(prompt);

            return scanner.nextLine();
        }
    }
}
