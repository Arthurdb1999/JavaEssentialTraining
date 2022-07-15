package com.example.java11.FormatNumbers;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        
        Locale locale = new Locale("pt", "BR");
        
        double doubleValue = 1_234_567.89;
        
        // Seta o locale adequado, pois o numero pode aparecer com, ou .
        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + numF.format(doubleValue));
        
        NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency: " + curF.format(doubleValue));
        
        NumberFormat intF = NumberFormat.getIntegerInstance(locale);
        System.out.println("Integer: " + intF.format(doubleValue));
    }

}
