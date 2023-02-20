package Uf3Practica3Ex1;

import java.io.*;
import java.util.*;

public class Ex1 {

    static Scanner scan = new Scanner(System.in);

    public static void CrerArxiu() {
        FileOutputStream fos = new FileOutputStream("numeros.dat");
        DataOutputStream dos = new DataOutputStream(fos);
    }

    public static void Escriure(DataOutputStream dos) {
        int num;
        do {
            System.out.print("Introdueix un número (0 per finalitzar): ");
            num = scan.nextInt();
            dos.writeInt(num);
        } while (num != 0);

        System.out.println("S'han escrit els números al fitxer.");
    }

    public static void main(String[] args) {
        CrerArxiu();
        Escriure();
    }
}
