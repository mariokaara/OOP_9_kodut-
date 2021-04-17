import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.io.*;

public class Kaja {


    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"))) {
            String rida = br.readLine();
            while (!rida.equals("0")) {
                System.out.println("lugesin voost: " + rida);
                rida = br.readLine(); // loeb järgmise rea. kui ei saa, tagastab nulli
            }
        }
    }
}