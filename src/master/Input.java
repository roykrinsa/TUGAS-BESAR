
package master;

import java.util.Scanner;


public class Input {
    identitas_ruangan obj =new identitas_ruangan();
    public void insertdatakuncipintujendelabahaya() {
        Scanner one=new Scanner(System.in);
   
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
    public void cetakdatakuncipintujendelabahaya(){
        
        System.out.println("nama ruangan : "+obj.getNamaruangan());
        System.out.println("lokasi ruangan : "+obj.getLokasi_ruangan());
        System.out.println("program studi : "+obj.getProgram_studi());
        System.out.println("kunci pintu : "+obj.getKunci_pintu());
        System.out.println("kebahayaan : "+obj.getBahaya());
        System.out.println("jendela : "+obj.getJendela());
        
        
        
    }
}
