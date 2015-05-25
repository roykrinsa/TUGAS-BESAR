/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master;

import java.util.Scanner;

/**
 *
 * @author Soveatin
 */
public class inputkondisiruang {
    KondisiRuang obj = new KondisiRuang();
    Scanner in = new Scanner(System.in);
     void analisabentukruang(){
         
         System.out.println("Masukkan panjang = ");
         obj.setPanjang(in.nextInt());
         System.out.println("Masukkan lebar = ");
         obj.setLebar(in.nextInt());
 
}
     void analisakebersihan(){
         System.out.println("Masukkan nilai kondisi lantai = ");
         obj.setKondisiLantai(in.nextInt());
         System.out.println("Masukkan nilai kondisi dinding = ");
         obj.setKondisiDinding(in.nextInt());
         System.out.println("Masukkan nilai kondisi atap = ");
         obj.setKondisiAtap(in.nextInt());
         System.out.println("Masukkan nilai kondisi pintu = ");
         obj.setKondisiPintu(in.nextInt());
         System.out.println("Masukkan nilai kondisi jendela = ");
         obj.setKondisiJendela(in.nextInt());
     }
     void sirkulasiudara(){
         System.out.println("Masukkan nilai sirkulasi udara dalam ruangan = ");
         obj.setSirkulasiUdara(in.nextInt());
     }
     void cahaya_(){
         System.out.println("Masukkan nilai Pencahayaan = ");
         obj.setNilaiPencahayaan(in.nextInt());
     }
     void lembab(){
         System.out.println("Masukkan Nilai Kelembapan = ");
         obj.setKelembaban(in.nextInt());
     }
     void suhu(){
         System.out.println("Masukkan Nilai Suhu = ");
         obj.setSuhu(in.nextInt());
     }
     void kebisingan(){
         System.out.println("Masukkan Nilai Kebisingan = ");
         obj.setKebisingan(in.nextInt());
     }
     void bau_(){
         System.out.println("Masukkan Nilai Bau = ");
         obj.setBau(in.nextInt());
     }
     void kerusakan(){
         System.out.println("Masukkan Nilai Kerusakan = ");
         obj.setKerusakan(in.nextInt());
     }
     void bocorr(){
          System.out.println("Masukkan Nilai Kebocoran = ");
          obj.setKebocoran(in.nextInt());
     }
     void auss(){
          System.out.println("Masukkan Nilai Keausan = ");
          obj.setKeausan(in.nextInt());
     }
     void kokoh(){
         System.out.println("Masukkan Nilai kekokohan = ");
         obj.setKekokohan(in.nextInt());
     }
}
