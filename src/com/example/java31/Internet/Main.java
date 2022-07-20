package com.example.java31.Internet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    
    // A streams implementam a interface AutoClosable. Dessa vez, em vez de fazer um try with resources para fechar a stream
    // automaticamente, a stream será fechada explicitamente no bloco finally.

    private static final String FLOWERS_FEED =
            "https://services.hanselandpetal.com/feeds/flowers.xml";

    public static void main(String[] args) throws IOException {

        InputStream stream = null;
        BufferedInputStream buf = null; 
        
        try {
            URL url = new URL(FLOWERS_FEED);
            stream = url.openStream();
            buf = new BufferedInputStream(stream);

            StringBuilder sb = new StringBuilder();

            while (true) {
                int data = buf.read();

                if (data == -1) {
                    break;
                } else {
                    sb.append((char) data);
                }
            }

            System.out.println(sb);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            stream.close();
            buf.close();
        }
    }

}
