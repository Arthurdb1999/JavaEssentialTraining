package com.example.java28.AbstractClasses.model;

public enum OliveName {
    
    // Define os Enums disponíveis e formata o texto deles chamando o próprio construtor
    KALAMATA("Kalamata"), LIGURIAN("Ligurian");
    
    private String name;
    
    //Construtor de um Enum é descrito dessa maneira
    OliveName(String name) {
        this.name = name;
    }
    
    
    //Todo Enum tem um método toString, o qual sobreescrevemos para o jeito que quisermos.
    @Override
    public String toString() {
        return name;
    }
    
}
