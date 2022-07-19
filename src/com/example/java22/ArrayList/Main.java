package com.example.java22.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        // List é a interface, e ArrayList é uma das implementações dessa interface.
        // ArrayList é um array que pode crescer ou diminuir, sem precisar declarar um tamanho inicial.
        // Não precisa adicionar o tipo String no generic do ArrayList, pois já está declarado em List.
        List<String> list = new ArrayList<>();
        
        list.add("California");
        list.add("Oregon");
        list.add("Washington");
        
        System.out.println(list);
        
        list.add("Alaska");
        System.out.println(list);
        
        list.remove(0);
        System.out.println(list);
        
        String state = list.get(1);
        System.out.println("The second state is " + state);
        
        int pos = list.indexOf("Alaska");
        System.out.println("Alaska is at position " + pos);
    }

}
