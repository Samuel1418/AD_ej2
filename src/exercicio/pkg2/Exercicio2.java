/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream leer = new FileInputStream("/home/oracle/Desktop/ProbaExer2/texto1.txt");
            //Para que no sobreescriba hay que poner true aumentando asi su tamaño, con false si sobreescribe
            FileOutputStream escribir = new FileOutputStream("/home/oracle/Desktop/ProbaExer2/texto2.txt",true);
            int c;
            //Mientras tenga algo que leer que escriba
            while ((c = leer.read()) !=-1) {
                escribir.write(c);
            }
            escribir.close();
            leer.close();
        } catch (Exception e) {
        }
    }
}
