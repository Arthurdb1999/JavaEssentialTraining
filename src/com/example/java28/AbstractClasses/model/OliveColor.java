package com.example.java28.AbstractClasses.model;

public enum OliveColor {

    PURPLE("Purple", 0x2E0854), BLACK("Black", 0x000000), GREEN("Green", 0x00FF00);
    
    long color;
    String name;
    
    OliveColor(String name, long color) {
        this.color = color;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
