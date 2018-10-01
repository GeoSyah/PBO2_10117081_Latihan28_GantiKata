/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan28_gantikata;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Mengganti kata dalam suatu kalimat
 */
public class PBO2_10117081_Latihan28_GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String kata1;
        String kata2;
        String kata3;
        
        Scanner kata = new Scanner(System.in);
        
        System.out.println("===== Program Mengganti Nama =====");
        System.out.println("");
        System.out.print("Masukkan Kalimat\t : ");
       kata1 = kata.nextLine();
        System.out.print("Ganti Kata\t : ");
       kata2 = kata.next();
        System.out.print("Menjadi Kata\t : ");
       kata3 = kata.next();
       
        System.out.println("");
        System.out.println("===== Hasil Formatting =====");
        System.out.println("Kalimat Awal\t : " + kata1);
        String kataAkhir = kata1.replace(kata2, kata3);
        System.out.println("Kalimat Baru\t : " + kataAkhir);
        
        
    }
    
}
