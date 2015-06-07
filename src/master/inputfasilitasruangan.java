
package master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;


public abstract class inputfasilitasruangan extends fasilitasruangan  {

    Scanner in = new Scanner(System.in);
    public fasilitasruangan o= new fasilitasruangan();
    String fileme ="inputfasilitasruangan.txt";
    
 public void masukkan(){ 
        System.out.println("Masukkan jumlah steker = ");
        o.setJumlahsteker(in.nextInt());
        System.out.println("Masukkan kondisi steker = ");
        o.setKondisisteker(in.nextInt());
        System.out.println("Masukkan posisi steker = ");
        o.setPosisisteker(in.nextInt());  
         System.out.println("Masukkan jumlah kabel LCD = ");
        o.setJumlahkabellcd(in.nextInt());
        System.out.println("Masukkan kondisi kabel LCD = ");
        o.setKondisikabellcd(in.nextInt());
        System.out.println("Masukkan posisi kabel LCD = ");
        o.setPosisikabellcd(in.nextInt());       
        System.out.println("Masukkan jumlah lampu = ");
        o.setJumlahlampu(in.nextInt());
        System.out.println("Masukkan kondisi lampu = ");
        o.setKondisilampu(in.nextInt());
        System.out.println("Masukkan posisi lampu = ");
        o.setPosisilampu(in.nextInt());       
         System.out.println("Masukkan jumlah kipas angin = ");
        o.setJumlahkipasangin(in.nextInt());
        System.out.println("Masukkan kondisi kipas angin = ");
        o.setKondisikipasangin(in.nextInt());
        System.out.println("Masukkan posisi kipas angin = ");
        o.setPosisikipasangin(in.nextInt());       
        System.out.println("Masukkan jumlah AC = ");
        o.setJumlahac(in.nextInt());
        System.out.println("Masukkan kondisi AC = ");
        o.setKondisiac(in.nextInt());
        System.out.println("Masukkan posisi AC = ");
        o.setPosisiac(in.nextInt());       
        System.out.println("Masukkan SSID = ");
        o.setSSID(in.nextLine());
        System.out.println("dapat login = ");
        o.setLogin(in.nextInt());
        System.out.println("Masukkan jumlah CCTV = ");
        o.setJumlahcctv(in.nextInt());
        System.out.println("Masukkan kondisi CCTV = ");
        o.setKondisicctv(in.nextInt());
        System.out.println("Masukkan posisi CCTV = ");
        o.setPosisicctv(in.nextInt());       
        System.out.println("Masukkan jumlah pintu = ");
        o.setJumlahpintu(in.nextInt());
        System.out.println("Masukkan jumlah jendela = ");
        o.setJumlahjendela(in.nextInt());
        System.out.println("Masukkan jumlah kursi = ");
        o.setJumlahkursi(in.nextInt());
       
}
public void save(){
		try{
		ObjectOutputStream tulis = new ObjectOutputStream(new FileOutputStream(fileme));
		tulis.writeObject("jumlah Steker  : "+getJumlahsteker());
		tulis.writeObject("kondisi Steker : "+getKondisisteker());
		tulis.writeObject("posisi Steker : "+getPosisisteker());
                tulis.writeObject("jumlah LCD  : "+getJumlahkabellcd());
		tulis.writeObject("kondisi LCD : "+getKondisikabellcd());
		tulis.writeObject("posisi LCD : "+getPosisikabellcd());
                tulis.writeObject("jumlah Lampu  : "+getJumlahlampu());
		tulis.writeObject("kondisi Lampu : "+getKondisilampu());
		tulis.writeObject("posisi Lampu : "+getPosisilampu());
                tulis.writeObject("jumlah Kipasangin  : "+getJumlahkipasangin());
		tulis.writeObject("kondisi Kipasangin : "+getKondisikipasangin());
		tulis.writeObject("posisi Kipasangin : "+getPosisikipasangin());
                tulis.writeObject("jumlah AC  : "+getJumlahac());
		tulis.writeObject("kondisi AC : "+getKondisiac());
		tulis.writeObject("posisi AC : "+getPosisiac());
                tulis.writeObject("jumlah CCTV  : "+getJumlahcctv());
		tulis.writeObject("kondisi CCTV : "+getKondisicctv());
		tulis.writeObject("posisi CCTV : "+getPosisicctv());
                tulis.writeObject("jumlah jendela : "+getJumlahpintu());
		tulis.writeObject("jumlah pintu : "+getJumlahpintu());
                tulis.writeObject("jumlah kursi : "+getJumlahkursi());
                               
		tulis.close();
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
	ObjectInputStream os = new ObjectInputStream(new FileInputStream(fileme));
	 os.readObject();
        System.out.println("Masukkan jumlah steker = "+getJumlahsteker());
        System.out.println("Masukkan kondisi steker = "+getKondisisteker());
        System.out.println("Masukkan posisi steker = "+getPosisisteker());
        System.out.println("Masukkan jumlah kabel LCD = "+getJumlahkabellcd());
        System.out.println("Masukkan kondisi kabel LCD = "+getKondisikabellcd());
        System.out.println("Masukkan posisi kabel LCD = "+getPosisikabellcd());
        System.out.println("Masukkan jumlah lampu = "+getJumlahlampu());
        System.out.println("Masukkan kondisi lampu = "+getKondisilampu());
        System.out.println("Masukkan posisi lampu = "+getPosisilampu());
        System.out.println("Masukkan jumlah kipas angin = "+getJumlahkipasangin());
        System.out.println("Masukkan kondisi kipas angin = "+getKondisikipasangin());
        System.out.println("Masukkan posisi kipas angin = "+getPosisikipasangin());
        System.out.println("Masukkan jumlah AC = "+getJumlahac());
        System.out.println("Masukkan kondisi AC = "+getKondisiac());
        System.out.println("Masukkan posisi AC = "+getPosisiac());
        System.out.println("Masukkan SSID = "+getSSID());
        System.out.println("dapat login = "+getLogin());
        System.out.println("Masukkan jumlah CCTV = "+getJumlahcctv());
        System.out.println("Masukkan kondisi CCTV = "+getKondisicctv());
        System.out.println("Masukkan posisi CCTV = "+getPosisicctv());
        System.out.println("Masukkan jumlah pintu = "+getJumlahpintu());
        System.out.println("Masukkan jumlah jendela = "+getJumlahjendela());
        System.out.println("Masukkan jumlah kursi : "+getJumlahkursi());
        
       
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
  }
void input(){
    
}
}

