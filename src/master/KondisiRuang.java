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
public class KondisiRuang {
   private int panjang;
   private int lebar;
   private int kondisiLantai;
   private int kondisiDinding;
   private int kondisiAtap;
   private int kondisiPintu;
   private int kondisiJendela;
   private int sirkulasiUdara;
   private int nilaiPencahayaan;
   private int kelembaban;
   private int suhu;
   private int kebisingan;
   private int bau;
   private int kebocoran;
   private int kerusakan;
   private int keausan;
   private int kekokohan;
 
   
    KondisiRuang(){
       
   }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int pjg) {
        this.panjang = pjg;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lbr) {
        this.lebar = lbr;
    }

    public int getKondisiLantai() {
        return kondisiLantai;
    }

    public void setKondisiLantai(int lantai) {
        this.kondisiLantai = lantai;
    }

    public int getKondisiDinding() {
        return kondisiDinding;
    }

    public void setKondisiDinding(int dinding) {
        this.kondisiDinding = dinding;
    }

    public int getKondisiAtap() {
        return kondisiAtap;
    }

    public void setKondisiAtap(int atap) {
        this.kondisiAtap = atap;
    }

    public int getKondisiPintu() {
        return kondisiPintu;
    }

    public void setKondisiPintu(int door) {
        this.kondisiPintu = door;
    }

    public int getKondisiJendela() {
        return kondisiJendela;
    }

    public void setKondisiJendela(int window) {
        this.kondisiJendela = window;
    }

    public int getSirkulasiUdara() {
        return sirkulasiUdara;
    }

    public void setSirkulasiUdara(int air) {
        this.sirkulasiUdara = air;
    }

    public int getNilaiPencahayaan() {
        return nilaiPencahayaan;
    }

    public void setNilaiPencahayaan(int cahaya) {
        this.nilaiPencahayaan = cahaya;
    }

    public int getKelembaban() {
        return kelembaban;
    }

    public void setKelembaban(int lembab) {
        this.kelembaban = lembab;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int temperature) {
        this.suhu = temperature;
    }

    public int getKebisingan() {
        return kebisingan;
    }

    public void setKebisingan(int bising) {
        this.kebisingan = bising;
    }

    public int getBau() {
        return bau;
    }

    public void setBau(int smell) {
        this.bau = smell;
    }

    public int getKebocoran() {
        return kebocoran;
    }

    public void setKebocoran(int bocor) {
        this.kebocoran = bocor;
    }

    public int getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(int broken) {
        this.kerusakan = broken;
    }

    public int getKeausan() {
        return keausan;
    }

    public void setKeausan(int ausan) {
        this.keausan = ausan;
    }

    public int getKekokohan() {
        return kekokohan;
    }

    public void setKekokohan(int kokoh) {
        this.kekokohan = kokoh;
    }
    public void setKondisi( int kondisiLantai,  int kondisiDinding,  int kondisiAtap,  int kondisiPintu,  int kondisiJendela){
        this.kondisiLantai=kondisiLantai;
        this.kondisiDinding=kondisiDinding;
        this.kondisiJendela=kondisiJendela;
        this.kondisiAtap=kondisiAtap;
        this.kondisiPintu=kondisiPintu;
        
    }
    public void setKeadaan(int kebocoran,int kerusakan,int keausan,int kekokohan, int bau, int kebisingan){
        this.kebocoran=kebocoran;
        this.kerusakan=kerusakan;
        this.keausan=keausan;
        this.kekokohan=kekokohan;
        this.bau=bau;
        this.kebisingan=kebisingan;
    }
    public void setUdara(int sirkulasiUdara,int nilaiPencahayaan,int kelembaban,int suhu){
        this.sirkulasiUdara=sirkulasiUdara;
        this.nilaiPencahayaan=nilaiPencahayaan;
        this.kelembaban=kelembaban;
        this.suhu=suhu;
             
    }
    public void luas(int panjang, int lebar){
        this.panjang=panjang;
        this.lebar=lebar;
        
    }


    
}
