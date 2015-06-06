
package master;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;


public class Input extends identitas_ruangan {
    identitas_ruangan obj =new identitas_ruangan();
    Scanner one=new Scanner(System.in);
    String files = "inputanidentitas.txt";
    
    @Override
    public void identitas(String nama_ruangan, String lokasi_ruangan, String progrsm_studi){
       super.identitas(nama_ruangan, lokasi_ruangan, program_studi);
    }
    @Override
    public void secure(int jendela, int bahaya, int kunci_pintu){
      super.secure(kunci_pintu, bahaya, jendela);
    }
    
    public void insertdatakuncipintujendelabahaya() {
        
   
        System.out.println("masukan nama ruangan :  ");
        obj.setNamaruangan(one.nextLine());
        System.out.println("msukan lokasi ruangan : ");
        obj.setLokasi_ruangan(one.nextLine());
        System.out.println("masukan program studi :");
        obj.setProgram_studi(one.nextLine());
        System.out.println("cek kunci pintu : 0 atau 1  (ada = 1 tidak ada = 0) ");
       obj.setKunci_pintu(one.nextInt());
        System.out.println("intensitas kebahayaan : 0 atau 1 (bahaya = 0 aman =1) ");
       obj.setBahaya(one.nextInt());
        System.out.println("cek jendela : 0 atau 1 (tidak ada = 0 ada = 1 )");
        obj.setJendela(one.nextInt());
        
        
    }
      public void simpan1(){
        try{
             ObjectOutputStream fill = new ObjectOutputStream(new FileOutputStream(files));
             fill.writeObject("Masukkan nama ruangan : "+obj.getNamaruangan());
             fill.writeObject("Masukkan lokasi ruangan : "+obj.getLokasi_ruangan());
             fill.writeObject("Masukkan program studi : "+obj.getProgram_studi());
             fill.writeObject("Masukkan kunci pintu : "+obj.getKunci_pintu());
             fill.writeObject("Masukkan bahaya : "+obj.getBahaya());
             fill.writeObject("Masukkan jendela : "+obj.getJendela());
             
            
        }
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
        
    }
      public void read(){
          try{
              ObjectInputStream is = new ObjectInputStream(new FileInputStream(files));
              is.readObject();
              System.out.println("Masukkan nama ruangan : "+obj.getNamaruangan());
              System.out.println("Masukkan lokasi ruangan : "+obj.getLokasi_ruangan());
              System.out.println("Masukkan Program Studi : "+obj.getProgram_studi());
              System.out.println("Masukkan jendela : "+obj.getJendela());
              System.out.println("Masukkan bahaya : "+obj.getBahaya());
              System.out.println("Masukkan kunci pintu : "+obj.getKunci_pintu());
              is.close();
          }
          catch(FileNotFoundException e){
              e.printStackTrace();
          }
          catch(IOException e){
              e.printStackTrace();
          }
          catch(ClassNotFoundException e){
              e.printStackTrace();
          }
      }
}

