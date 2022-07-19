package com.example.java29.CopyFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        
        //FIX: file destination is wrong, so the script doesn't run.
        File sourceFile = new File("/eclipse-workspace/JavaEssentialTraining/src/com/example/java29/CopyFile/files/loremipsum.txt");
        File targetFile = new File("/eclipse-workspace/JavaEssentialTraining/src/com/example/java29/CopyFile/files/target.txt");
        
        // Esse tipo de try se chama try-with-resources. Significa que os objetos que estão dentro dos parenteses 
        // possuem métodos close(), ou seja, implementam uma interface chamada AutoClosable. Todos esses objetos
        // precisam ser fechados antes de finalizar o trecho de código. Ao chamar esses métodos com esse try, o
        // o próprio JRE vai chamar os close() por mim.
        try (
                FileReader fReader = new FileReader(sourceFile);
                // BufferedReader permite que se faça a leitura do arquivo uma linha por vez.
                BufferedReader bReader = new BufferedReader(fReader);
                FileWriter writer = new FileWriter(targetFile);
        ) {
            
            while (true) {
                String line = bReader.readLine();
                if (line == null) {
                    break;
                } else {
                    writer.write(line + "\n");
                }
            }
            System.out.println("File copied!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
