
package master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;


public class inputkondisiruang extends KondisiRuang {
    KondisiRuang obj = new KondisiRuang();
    Scanner in = new Scanner(System.in);
    String files = "inputkondruang.txt";
    

  
    
    @Override
    public void setKondisi(int kondisiLantai, int kondisiDinding, int kondisiAtap, int kondisiPintu, int kondisiJendela) {
        super.setKondisi(kondisiLantai, kondisiDinding, kondisiAtap, kondisiPintu, kondisiJendela); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void setUdara(int sirkulasiUdara, int nilaiPencahayaan,int kelembaban,int suhu){
        super.setUdara(sirkulasiUdara, sirkulasiUdara, sirkulasiUdara, sirkulasiUdara);
    }
    
     void inputankondisiruangan(){
         
         System.out.println("Masukkan panjang = ");
         obj.setPanjang(in.nextInt());
         System.out.println("Masukkan lebar = ");
         obj.setLebar(in.nextInt());
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
         System.out.println("Masukkan nilai sirkulasi udara dalam ruangan = ");
         obj.setSirkulasiUdara(in.nextInt());
         System.out.println("Masukkan nilai Pencahayaan = ");
         obj.setNilaiPencahayaan(in.nextInt());
          System.out.println("Masukkan Nilai Kelembapan = ");
         obj.setKelembaban(in.nextInt());
          System.out.println("Masukkan Nilai Suhu = ");
         obj.setSuhu(in.nextInt());
          System.out.println("Masukkan Nilai Kebisingan = ");
         obj.setKebisingan(in.nextInt());
          System.out.println("Masukkan Nilai Bau = ");
         obj.setBau(in.nextInt());
         System.out.println("Masukkan Nilai Kerusakan = ");
         obj.setKerusakan(in.nextInt());
         System.out.println("Masukkan Nilai Kebocoran = ");
         obj.setKebocoran(in.nextInt());
         System.out.println("Masukkan Nilai Keausan = ");
         obj.setKeausan(in.nextInt());
         System.out.println("Masukkan Nilai kekokohan = ");
         obj.setKekokohan(in.nextInt());
       
}
     void in(){
         
     }
     

     public void simpan(){
        try{
             ObjectOutputStream fill = new ObjectOutputStream(new FileOutputStream(files));
	     fill.writeObject("Masukkan panjang : "+obj.getPanjang());
             fill.writeObject("Masukka lebar : "+obj.getLebar());
             fill.writeObject("Masukkan kondisi atap : "+obj.getKondisiAtap());
             fill.writeObject("Masukkan kondisi dinding : "+obj.getKondisiDinding());
             fill.writeObject("Masukkan kondisi jendela : "+obj.getKondisiJendela());
             fill.writeObject("Masukkan kondisi lantai : "+obj.getKondisiLantai());
             fill.writeObject("Masukkan kondisi pintu : "+obj.getKondisiPintu());
             fill.writeObject("Masukkan nilai pencahayaan : "+obj.getNilaiPencahayaan());
             fill.writeObject("Masukkan nilai sirkulasi udara : "+obj.getSirkulasiUdara());
             fill.writeObject("Masukkan suhu ruangan : "+obj.getSuhu());
             fill.writeObject("Masukkan nilai kelembaban : "+obj.getKelembaban());
             fill.writeObject("Masukkan nilai kebisingan : "+obj.getKebisingan());
             fill.writeObject("Masukkan nilai bau : "+obj.getBau());
             fill.writeObject("Masukkan nilai kerusakan : "+obj.getKerusakan());
             fill.writeObject("Masukkan nilai ke-ausan : "+obj.getKeausan());
             fill.writeObject("Masukkan nilai kekokohan : "+obj.getKekokohan());
             fill.close();
        }
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
 
         }
     public void readme(){
         try {
	ObjectInputStream is = new ObjectInputStream(new FileInputStream(files));
	 is.readObject();
         System.out.println("Masukkan panjang = "+obj.getPanjang());
         System.out.println("Masukkan lebar = "+obj.getLebar());        
         System.out.println("Masukkan nilai kondisi lantai = "+obj.getKondisiLantai());       
         System.out.println("Masukkan nilai kondisi dinding = "+obj.getKondisiDinding());         
         System.out.println("Masukkan nilai kondisi atap = "+obj.getKondisiDinding());         
         System.out.println("Masukkan nilai kondisi pintu = "+obj.getKondisiPintu());       
         System.out.println("Masukkan nilai kondisi jendela = "+obj.getKondisiJendela());         
         System.out.println("Masukkan nilai sirkulasi udara dalam ruangan = "+obj.getSirkulasiUdara());        
         System.out.println("Masukkan nilai Pencahayaan = "+obj.getNilaiPencahayaan());         
         System.out.println("Masukkan Nilai Kelembapan = "+obj.getKelembaban());         
         System.out.println("Masukkan Nilai Suhu = "+obj.getSuhu());         
         System.out.println("Masukkan Nilai Kebisingan = "+obj.getKebisingan());        
         System.out.println("Masukkan Nilai Bau = "+obj.getBau());       
         System.out.println("Masukkan Nilai Kerusakan = "+obj.getKerusakan());
         System.out.println("Masukkan Nilai Kebocoran = "+obj.getKebocoran());
         System.out.println("Masukkan Nilai Keausan = "+obj.getKeausan());
         System.out.println("Masukkan Nilai kekokohan = "+obj.getKekokohan());
        
       
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}



   


