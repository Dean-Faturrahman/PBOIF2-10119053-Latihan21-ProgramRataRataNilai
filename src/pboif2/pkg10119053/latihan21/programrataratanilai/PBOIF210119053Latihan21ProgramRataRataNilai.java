/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan21.programrataratanilai;

import java.util.Scanner;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program untuk menghitung rata rata nilai mahasiswa
 */
public class PBOIF210119053Latihan21ProgramRataRataNilai {
    
    public static double hitungRataRata(double jumlah, int n){
        double rata = jumlah / n;
        return rata;
    }
    
    public static void main(String[] args) {
        
        int n;
        double jumlah, nilai, rata;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        jumlah = 0;
        for (int i=1; i<=n; i++){
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = input.nextInt();
            jumlah += nilai;
        }
        System.out.println("Rata - rata nilai mahasiswa : " + hitungRataRata(jumlah,n));
    }
    
}
