/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dua;

/**
 *
 * @author MOKLET-2
 */
public class Main {
    public static void main(String[] args) {
        Pohon cemara = new Pohon();
        System.out.println("Pohon cemara");
        cemara.setNama();
        cemara.setTinggi();
        cemara.getNama();
        cemara.getTinggi();
        Pohon kelapa = new Pohon();
        System.out.println("Pohon kelapa");
        kelapa.setNama();
        kelapa.setTinggi();
        kelapa.getNama();
        kelapa.getTinggi();
    }
}
