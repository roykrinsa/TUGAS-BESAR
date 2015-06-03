
package master;

import java.util.Scanner;
import java.io.FileWriter;
public class inputkondisiruang extends KondisiRuang {
    KondisiRuang obj = new KondisiRuang();
    Scanner in = new Scanner(System.in);

    @Override
    public void setKondisi(int kondisiLantai, int kondisiDinding, int kondisiAtap, int kondisiPintu, int kondisiJendela) {
        super.setKondisi(kondisiLantai, kondisiDinding, kondisiAtap, kondisiPintu, kondisiJendela); //To change body of generated methods, choose Tools | Templates.
    }
    
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
     public void simpan(){
         try{
             FileWriter fill = new FileWriter("inputkondisiruang.txt");
             fill.write("Masukkan panjang : "+obj.getPanjang());
             fill.write("Masukka lebar : "+obj.getLebar());
             fill.write("Masukkan kondisi atap : "+obj.getKondisiAtap());
             fill.write("Masukkan kondisi dinding : "+obj.getKondisiDinding());
             fill.write("Masukkan kondisi jendela : "+obj.getKondisiJendela());
             fill.write("Masukkan kondisi lantai : "+obj.getKondisiLantai());
             fill.write("Masukkan kondisi pintu : "+obj.getKondisiPintu());
             fill.write("Masukkan nilai pencahayaan : "+obj.getNilaiPencahayaan());
             fill.write("Masukkan nilai sirkulasi udara : "+obj.getSirkulasiUdara());
             fill.write("Masukkan suhu ruangan : "+obj.getSuhu());
             fill.write("Masukkan nilai kelembaban : "+obj.getKelembaban());
             fill.write("Masukkan nilai kebisingan : "+obj.getKebisingan());
             fill.write("Masukkan nilai bau : "+obj.getBau());
             fill.write("Masukkan nilai kerusakan : "+obj.getKerusakan());
             fill.write("Masukkan nilai ke-ausan : "+obj.getKeausan());
             fill.write("Masukkan nilai kekokohan : "+obj.getKekokohan());
             fill.close();
         }
         catch(Exception b){
             b.printStackTrace();
             
         }
     }
}
