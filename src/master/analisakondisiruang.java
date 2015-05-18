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
    public analisakondisiruang(){
        analisabentukruang();
        analisakebersihan();
        sirkulasiudara();
        cahaya_();
        lembab();
        suhu();
        kebisingan();
        bau_();
        kerusakan();
        bocorr();
        auss();
        kokoh();
    }
    void bentuk(){
        if(obj.getPanjang()>obj.getLebar()){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
    }
    void bersih(){
        double b;
        b=obj.getKondisiLantai()*obj.getKondisiDinding()*obj.getKondisiAtap()*obj.getKondisiPintu()*obj.getKondisiJendela()/5;
        if(b>=75){
            System.out.println("Sudah Bersih");
        }
        else{
            System.out.println("Belum Bersih");
        }
    }
    void udra(){
        if(obj.getSirkulasiUdara()>=75){
            System.out.println("Sirkulasi Udara Lancar");
        }
        else{
            System.out.println("Sirkulasi ");
        }
    }
    void lighting(){
        if(obj.getNilaiPencahayaan()>=250 && obj.getNilaiPencahayaan()<=350){
            System.out.println("Sudah Sesuai");
            
        }
        else{
            System.out.println("Belum Sesuai");
        }
    }
    void lmbb(){
        if(obj.getKelembaban()>=70 && obj.getKelembaban()<=80){
            System.out.println("Sudah Sesuai");
        }
        else{
            System.out.println("Belum Sesuai");
        }
    }
    void suhuu(){
        if(obj.getSuhu()>=25 && obj.getSuhu()<=35){
            System.out.println("Sudah Sesuai");
        }
        else{
            System.out.println("Belum Sesuai");
        }
    }
    void bisingg(){
         if(obj.getKebisingan()<=75){
            System.out.println("Tidak Bising");
        }
        else{
            System.out.println("Bising");
        }
    }
    void bauuu(){
        if(obj.getBau()<=75){
            System.out.println("Ruangan Tidak Bau");
        }
        else{
            System.out.println("Ruangan Bau");
        }
    }
    void rusak(){
        if(obj.getKerusakan()<=75){
            System.out.println("Tidak Rusang dan Sudah Sesuai");
        }
        else{
            System.out.println("Rusak dan Belum Sesuai");
        }
    }
    void bocor(){
         if(obj.getKebocoran()<=75){
            System.out.println("Sudah Sesuai");
        }
        else{
            System.out.println("Sudah Sesuai");
        }
    }
    void aus(){
        if(obj.getKeausan()<=75){
            System.out.println("Sudah Sesuai");
        }
        else{
            System.out.println("Belum Sesuai");
        }
    }
    void kokoh(){
        if(obj.getKekokohan()>=75){
            System.out.println("Kokoh dan Sudah Sesuai");
        }
        else{
            System.out.println("Rapuh dan Belum Sesuai");
        }
    }
    
}
