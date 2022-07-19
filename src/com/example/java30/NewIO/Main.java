package com.example.java30.NewIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) {
        
        //FIX: path
        Path sourcefile = Paths.get("eclipse-workspace", "JavaEssentialTraining", "src", "com", "example", "java30", "NewIO", "files", "loremipsum.txt");
        Path targetFile = Paths.get("eclipse-workspace", "JavaEssentialTraining", "src", "com", "example", "java30", "NewIO", "files", "target.txt");
        
        try {
            Files.copy(sourcefile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied!  ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
