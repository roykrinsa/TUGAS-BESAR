
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
       
}
public void save(){
		try{
		ObjectOutputStream tulis = new ObjectOutputStream(new FileOutputStream(fileme));
		tulis.writeObject("jumlah Steker  : "+o.getJumlahsteker());
		tulis.writeObject("kondisi Steker : "+o.getKondisisteker());
		tulis.writeObject("posisi Steker : "+o.getPosisisteker());
                tulis.writeObject("jumlah LCD  : "+o.getJumlahkabellcd());
		tulis.writeObject("kondisi LCD : "+o.getKondisikabellcd());
		tulis.writeObject("posisi LCD : "+o.getPosisikabellcd());
                tulis.writeObject("jumlah Lampu  : "+o.getJumlahlampu());
		tulis.writeObject("kondisi Lampu : "+o.getKondisilampu());
		tulis.writeObject("posisi Lampu : "+o.getPosisilampu());
                tulis.writeObject("jumlah Kipasangin  : "+o.getJumlahkipasangin());
		tulis.writeObject("kondisi Kipasangin : "+o.getKondisikipasangin());
		tulis.writeObject("posisi Kipasangin : "+o.getPosisikipasangin());
                tulis.writeObject("jumlah AC  : "+o.getJumlahac());
		tulis.writeObject("kondisi AC : "+o.getKondisiac());
		tulis.writeObject("posisi AC : "+o.getPosisiac());
                tulis.writeObject("jumlah CCTV  : "+o.getJumlahcctv());
		tulis.writeObject("kondisi CCTV : "+o.getKondisicctv());
		tulis.writeObject("posisi CCTV : "+o.getPosisicctv());
                tulis.writeObject("jumlah jendela : "+o.getJumlahpintu());
		tulis.writeObject("jumlah pintu : "+o.getJumlahpintu());
                               
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
        System.out.println("Masukkan jumlah steker = "+o.getJumlahsteker());
        System.out.println("Masukkan kondisi steker = "+o.getKondisisteker());
        System.out.println("Masukkan posisi steker = "+o.getPosisisteker());
        System.out.println("Masukkan jumlah kabel LCD = "+o.getJumlahkabellcd());
        System.out.println("Masukkan kondisi kabel LCD = "+o.getKondisikabellcd());
        System.out.println("Masukkan posisi kabel LCD = "+o.getPosisikabellcd());
        System.out.println("Masukkan jumlah lampu = "+o.getJumlahlampu());
        System.out.println("Masukkan kondisi lampu = "+o.getKondisilampu());
        System.out.println("Masukkan posisi lampu = "+o.getPosisilampu());
        System.out.println("Masukkan jumlah kipas angin = "+o.getJumlahkipasangin());
        System.out.println("Masukkan kondisi kipas angin = "+o.getKondisikipasangin());
        System.out.println("Masukkan posisi kipas angin = "+o.getPosisikipasangin());
        System.out.println("Masukkan jumlah AC = "+o.getJumlahac());
        System.out.println("Masukkan kondisi AC = "+o.getKondisiac());
        System.out.println("Masukkan posisi AC = "+o.getPosisiac());
        System.out.println("Masukkan SSID = "+o.getSSID());
        System.out.println("dapat login = "+o.getLogin());
        System.out.println("Masukkan jumlah CCTV = "+o.getJumlahcctv());
        System.out.println("Masukkan kondisi CCTV = "+o.getKondisicctv());
        System.out.println("Masukkan posisi CCTV = "+o.getPosisicctv());
        System.out.println("Masukkan jumlah pintu = "+o.getJumlahpintu());
        System.out.println("Masukkan jumlah jendela = "+o.getJumlahjendela());
 
        
       
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

