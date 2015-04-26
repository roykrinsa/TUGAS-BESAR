/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author ALMIGHTY
 */
public class analisisfasilitasruangan {
    Scanner in = new Scanner(System.in);
    fasilitasruangan o = new fasilitasruangan();
    void Analisiskelistrikan(){ 
        System.out.println("Masukkan jumlah steker = ");
        o.setJumlahsteker(in.nextInt());
        System.out.println("Masukkan kondisi steker = ");
        o.setKondisisteker(in.nextInt());
        System.out.println("Masukkan posisi steker = ");
        o.setPosisisteker(in.nextInt());       
        if(o.getJumlahsteker()>=4){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
        if (o.getKondisisteker()==2) {
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        if(o.getPosisisteker()==1||o.getPosisisteker()==3)
        { System.out.println("sesuai");
            }
    else{
            System.out.println("tidak sesuai");
}
}
    void Analisislcd(){
         System.out.println("Masukkan jumlah kabel LCD = ");
        o.setJumlahkabellcd(in.nextInt());
        System.out.println("Masukkan kondisi kabel LCD = ");
        o.setKondisikabellcd(in.nextInt());
        System.out.println("Masukkan posisi kabel LCD = ");
        o.setPosisikabellcd(in.nextInt());       
        if(o.getJumlahkabellcd()>=1){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
        if (o.getKondisikabellcd()==2) {
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        if(o.getPosisikabellcd()==2)
        { System.out.println("sesuai");
            }
    else{
            System.out.println("tidak sesuai");
}
    }
    void Analisislampu(){
        System.out.println("Masukkan jumlah lampu = ");
        o.setJumlahlampu(in.nextInt());
        System.out.println("Masukkan kondisi lampu = ");
        o.setKondisilampu(in.nextInt());
        System.out.println("Masukkan posisi lampu = ");
        o.setPosisilampu(in.nextInt());       
        if(o.getJumlahlampu()>=18){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
        if (o.getKondisilampu()==2) {
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        if(o.getPosisilampu()==2)
        { System.out.println("sesuai");
            }
    else{
            System.out.println("tidak sesuai");
}
    }
    void Analisiskipasangin(){
     System.out.println("Masukkan jumlah kipas angin = ");
        o.setJumlahkipasangin(in.nextInt());
        System.out.println("Masukkan kondisi kipas angin = ");
        o.setKondisikipasangin(in.nextInt());
        System.out.println("Masukkan posisi kipas angin = ");
        o.setPosisikipasangin(in.nextInt());       
        if(o.getJumlahkipasangin()>=2){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
        if (o.getKondisikipasangin()==2) {
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        if(o.getKondisikipasangin()==2)
        { System.out.println("sesuai");
            }
    else{
            System.out.println("tidak sesuai");}}
    void Analisisac(){
    System.out.println("Masukkan jumlah AC = ");
        o.setJumlahac(in.nextInt());
        System.out.println("Masukkan kondisi AC = ");
        o.setKondisiac(in.nextInt());
        System.out.println("Masukkan posisi AC = ");
        o.setPosisiac(in.nextInt());       
        if(o.getJumlahac()>=1){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
        if (o.getKondisiac()==2) {
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        if(o.getPosisiac()==4)
        { System.out.println("sesuai");
            }
    else{
            System.out.println("tidak sesuai");
}}        
    void Analisisinternet(){
    System.out.println("Masukkan SSID = ");
        o.setSSID(in.nextLine());
        System.out.println("dapat login = ");
        o.setLogin(in.nextInt());
               
        if(o.getSSID()=="umm hotspot"||o.getSSID()=="UMM HOTSPOT"||o.getSSID()=="UMM Hotspot"){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
        if (o.getKondisilampu()==2) {
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        
}
    void Analisiscctv(){
System.out.println("Masukkan jumlah CCTV = ");
        o.setJumlahcctv(in.nextInt());
        System.out.println("Masukkan kondisi CCTV = ");
        o.setKondisicctv(in.nextInt());
        System.out.println("Masukkan posisi CCTV = ");
        o.setPosisicctv(in.nextInt());       
        if(o.getJumlahcctv()==2){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
        if (o.getKondisicctv()==2) {
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        if(o.getPosisicctv()==1||o.getPosisicctv()==3)
        { System.out.println("sesuai");
            }
    else{
            System.out.println("tidak sesuai");
}}
    void pintu(){
    System.out.println("Masukkan jumlah pintu = ");
        o.setJumlahpintu(in.nextInt());
        
               
        if(o.getJumlahpintu()>=2){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
        
        }
    void jendela(){
        System.out.println("Masukkan jumlah jendela = ");
        o.setJumlahjendela(in.nextInt());
        
               
        if(o.getJumlahjendela()>=1){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
        
    }










}
