
package master;

import java.io.FileWriter;
import java.util.Scanner;


public abstract class inputfasilitasruangan extends fasilitasruangan  {

    Scanner in = new Scanner(System.in);
    public fasilitasruangan o= new fasilitasruangan();
    
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
		FileWriter tulis = new FileWriter("inputfasilitasruangan.txt");
		tulis.write("jumlah Steker  : "+o.getJumlahsteker());
		tulis.write("kondisi Steker : "+o.getKondisisteker());
		tulis.write("posisi Steker : "+o.getPosisisteker());
                tulis.write("jumlah LCD  : "+o.getJumlahkabellcd());
		tulis.write("kondisi LCD : "+o.getKondisikabellcd());
		tulis.write("posisi LCD : "+o.getPosisikabellcd());
                tulis.write("jumlah Lampu  : "+o.getJumlahlampu());
		tulis.write("kondisi Lampu : "+o.getKondisilampu());
		tulis.write("posisi Lampu : "+o.getPosisilampu());
                tulis.write("jumlah Kipasangin  : "+o.getJumlahkipasangin());
		tulis.write("kondisi Kipasangin : "+o.getKondisikipasangin());
		tulis.write("posisi Kipasangin : "+o.getPosisikipasangin());
                tulis.write("jumlah AC  : "+o.getJumlahac());
		tulis.write("kondisi AC : "+o.getKondisiac());
		tulis.write("posisi AC : "+o.getPosisiac());
                tulis.write("jumlah CCTV  : "+o.getJumlahcctv());
		tulis.write("kondisi CCTV : "+o.getKondisicctv());
		tulis.write("posisi CCTV : "+o.getPosisicctv());
                tulis.write("jumlah jendela : "+o.getJumlahpintu());
		tulis.write("jumlah pintu : "+o.getJumlahpintu());
                               
		tulis.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
}
void input(){
    
}}
