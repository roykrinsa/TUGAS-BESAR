/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master;

/**
 *
 * @author Soveatin
 */
public class analisakondisiruang extends inputkondisiruang {
 
    public void analisakondisiruang(){
    inputankondisiruangan();
    bentuk();
    bersih();
    udra();
    lighting();
    lmbb();
    bisingg();
    bauuu();
    rusak();
    bocor();
    aus();
    kkoh();
    }
    @Override
    public void in(){
        inputankondisiruangan();
    }
    int bentuk(){
        if(obj.getPanjang()>obj.getLebar()){
            
            System.out.println("Sesuai");
            return 1;
        }
        else{
            
            System.out.println("Tidak sesuai");
            return 0;
        }
        
    }
    int bersih(){
        double b;
       
        b=obj.getKondisiLantai()*obj.getKondisiDinding()*obj.getKondisiAtap()*obj.getKondisiPintu()*obj.getKondisiJendela()/5;
        if(b>=75){
             
            System.out.println("Sudah Bersih");
            return 1;
        }
        else{
            System.out.println("Belum Bersih");
            return 0;
        }
        
    }
    int udra(){
        if(obj.getSirkulasiUdara()>=75){
            
            System.out.println("Sirkulasi Udara Lancar");
            return 1;
        }
        else{
            System.out.println("Sirkulasi ");
            return 0;
        }
        
    }
    int lighting(){
        if(obj.getNilaiPencahayaan()>=250 && obj.getNilaiPencahayaan()<=350){
            
            System.out.println("Sudah Sesuai");
            return 1;
            
        }
        else{
            System.out.println("Belum Sesuai");
            return 0;
        }
        
    }
    int lmbb(){
        if(obj.getKelembaban()>=70 && obj.getKelembaban()<=80){
            
            System.out.println("Sudah Sesuai");
            return 1;
        }
        else{
            System.out.println("Belum Sesuai");
            return 0;
        }
        
    }
    int suhuu(){
        if(obj.getSuhu()>=25 && obj.getSuhu()<=35){
            
            System.out.println("Sudah Sesuai");
            return 1;
        }
        else{
            System.out.println("Belum Sesuai");
            return 0;
        }
        
    }
    int bisingg(){
         if(obj.getKebisingan()<=75){
            
            System.out.println("Tidak Bising");
            return 1;
        }
        else{
            System.out.println("Bising");
            return 0;
        }
         
    }
    int bauuu(){
        if(obj.getBau()<=75){
            
            System.out.println("Ruangan Tidak Bau");
            return 1;
        }
        else{
            System.out.println("Ruangan Bau");
            return 0;
        }
        
    }
    int rusak(){
        if(obj.getKerusakan()<=75){
          
            System.out.println("Tidak Rusang dan Sudah Sesuai");
            return 1;
        }
        else{
            System.out.println("Rusak dan Belum Sesuai");
            return 0;
        }
        
    }
    int bocor(){
         if(obj.getKebocoran()<=75){
           
            System.out.println("Sudah Sesuai");
            return 1;
        }
        else{
            System.out.println("Sudah Sesuai");
            return 0;
        }
         
    }
    int aus(){
        if(obj.getKeausan()<=75){
            
            System.out.println("Sudah Sesuai");
            return 1;
        }
        else{
            System.out.println("Belum Sesuai");
            return 0;
        }
        
    }
    int kkoh(){
        if(obj.getKekokohan()>=75){
           
            System.out.println("Kokoh dan Sudah Sesuai");
            return 1;
        }
        else{
            System.out.println("Rapuh dan Belum Sesuai");
            return 0;
        }
        
    }
    
}
