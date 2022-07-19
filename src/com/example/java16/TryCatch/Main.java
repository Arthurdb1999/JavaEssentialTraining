package com.example.java16.TryCatch;

public class Main {

    public static void main(String[] args) {
        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();
        
        try {
            char lastChar = chars[chars.length];
            System.out.println(lastChar);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
