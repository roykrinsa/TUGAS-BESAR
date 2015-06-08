
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
             fill.writeObject("Masukkan nama ruangan : "+getNamaruangan());
             fill.writeObject("Masukkan lokasi ruangan : "+getLokasi_ruangan());
             fill.writeObject("Masukkan program studi : "+getProgram_studi());
             fill.writeObject("Masukkan kunci pintu : "+getKunci_pintu());
             fill.writeObject("Masukkan bahaya : "+getBahaya());
             fill.writeObject("Masukkan jendela : "+getJendela());
             
            
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
              System.out.println("Masukkan nama ruangan : "+getNamaruangan());
              System.out.println("Masukkan lokasi ruangan : "+getLokasi_ruangan());
              System.out.println("Masukkan Program Studi : "+getProgram_studi());
              System.out.println("Masukkan jendela : "+getJendela());
              System.out.println("Masukkan bahaya : "+getBahaya());
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

