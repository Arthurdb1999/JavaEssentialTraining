package com.example.java28.AbstractClasses;

import java.util.ArrayList;
import java.util.List;

import com.example.java28.AbstractClasses.model.*;

/**
 * 
 * @author i564938
 * This is an <b>olive press</b> application, and its job is to <i>press olives</i>.
 *
 */
public class Main {

    /**
     * The main method
     * @param args - an arrayof String values
     */
    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil: " + totalOil);
        
    }

}
