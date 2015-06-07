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
public class analisakondisiruang extends inputkondisiruang implements interfaceKondisi {
 
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
        if(getPanjang()>getLebar()){
            
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
       
        b=getKondisiLantai()*getKondisiDinding()*getKondisiAtap()*getKondisiPintu()*getKondisiJendela()/5;
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
        if(getSirkulasiUdara()>=75){
            
            System.out.println("Sirkulasi Udara Lancar");
            return 1;
        }
        else{
            System.out.println("Sirkulasi ");
            return 0;
        }
        
    }
    int lighting(){
        if(getNilaiPencahayaan()>=250 && getNilaiPencahayaan()<=350){
            
            System.out.println("Sudah Sesuai");
            return 1;
            
        }
        else{
            System.out.println("Belum Sesuai");
            return 0;
        }
        
    }
    int lmbb(){
        if(getKelembaban()>=70 && getKelembaban()<=80){
            
            System.out.println("Sudah Sesuai");
            return 1;
        }
        else{
            System.out.println("Belum Sesuai");
            return 0;
        }
        
    }
    int suhuu(){
        if(getSuhu()>=25 && getSuhu()<=35){
            
            System.out.println("Sudah Sesuai");
            return 1;
        }
        else{
            System.out.println("Belum Sesuai");
            return 0;
        }
        
    }
    int bisingg(){
         if(getKebisingan()<=75){
            
            System.out.println("Tidak Bising");
            return 1;
        }
        else{
            System.out.println("Bising");
            return 0;
        }
         
    }
    int bauuu(){
        if(getBau()<=75){
            
            System.out.println("Ruangan Tidak Bau");
            return 1;
        }
        else{
            System.out.println("Ruangan Bau");
            return 0;
        }
        
    }
    int rusak(){
        if(getKerusakan()<=75){
          
            System.out.println("Tidak Rusang dan Sudah Sesuai");
            return 1;
        }
        else{
            System.out.println("Rusak dan Belum Sesuai");
            return 0;
        }
        
    }
    int bocor(){
         if(getKebocoran()<=75){
           
            System.out.println("Sudah Sesuai");
            return 1;
        }
        else{
            System.out.println("Sudah Sesuai");
            return 0;
        }
         
    }
    int aus(){
        if(getKeausan()<=75){
            
            System.out.println("Sudah Sesuai");
            return 1;
        }
        else{
            System.out.println("Belum Sesuai");
            return 0;
        }
        
    }
    int kkoh(){
        if(getKekokohan()>=75){
           
            System.out.println("Kokoh dan Sudah Sesuai");
            return 1;
        }
        else{
            System.out.println("Rapuh dan Belum Sesuai");
            return 0;
        }
        
    }

    @Override
    public void intfkondRuang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
