/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dua;
import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Pohon {
    Scanner I = new Scanner(System.in);
    
    String nama;
    int tinggi;
    
    void setNama(){
        System.out.print("Masukkan nama\t= ");
        nama = I.nextLine();
    }
    void setTinggi(){
        System.out.print("Masukkan tinggi\t= ");
        tinggi = I.nextInt();
    }
    String getNama(){
        return nama;
    }
    int getTinggi(){
        return tinggi;
    }
}
