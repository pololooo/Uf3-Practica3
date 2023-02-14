/*
1. Crea un programa que llegeixi números enters per teclat i els vagi guardant en un
fitxer “numeros.dat”. El programa finalitzarà quan s’entri el número zero.
Cal que adjunteu a la resolució de la pràctica una captura de pantalla on es vegi
el contingut del fitxer en format hexadecimal.
 */
package uf3.practica3;

import java.util.*;
import java.io.*;

public class Uf3Practica3 {

    public static void main(String[] args) {
        
    }
    
}


/*
public class EscriureFitxerNumeros {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);
             FileOutputStream fos = new FileOutputStream("numeros.dat");
             DataOutputStream dos = new DataOutputStream(fos)) {

            int num;
            do {
                System.out.print("Introdueix un número (0 per finalitzar): ");
                num = sc.nextInt();
                dos.writeInt(num);
            } while (num != 0);

            System.out.println("S'han escrit els números al fitxer.");

        } catch (IOException e) {
            System.err.println("Error escrivint al fitxer: " + e.getMessage());
        }
    }

}

*/