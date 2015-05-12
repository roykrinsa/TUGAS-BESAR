
import java.util.Scanner;
import kondisiruang.KondisiRuang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soveatin
 */
public class analisa_kondisi_ruang {
     Scanner in = new Scanner(System.in);
    
    void analisabentukruang(){
        int a;
        KondisiRuang persegi = new KondisiRuang();
        System.out.println("Masukkan panjang Ruang = ");
        persegi.setPanjang(in.nextInt());
        System.out.println("Masukkan Lebar Ruang = ");
        persegi.setLebar(in.nextInt());
        a=persegi.getPanjang()*persegi.getLebar();
        if(persegi.getPanjang()!=a){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
    }
    void analisakebershina(){
        double b;
        KondisiRuang bersih = new KondisiRuang();
        System.out.println("Masukkan nilai kondisi lantai = ");
        bersih.setKondisiLantai(in.nextInt());
        System.out.println("Masukkan nilai kondisi dinding = ");
        bersih.setKondisiDinding(in.nextInt());
        System.out.println("Masukkan nilai kondisi atap = ");
        bersih.setKondisiAtap(in.nextInt());
        System.out.println("Masukkan nilai kondisi pintu = ");
        bersih.setKondisiPintu(in.nextInt());
        System.out.println("Masukkan nilai kondisi jendela = ");
        bersih.setKondisiJendela(in.nextInt());
        b=bersih.getKondisiLantai()*bersih.getKondisiDinding()*bersih.getKondisiAtap()*bersih.getKondisiPintu()*bersih.getKondisiJendela()/5;
        if(b>=75){
            System.out.println("Sudah Bersih");
        }
        else{
            System.out.println("Belum Bersih");
        }
        
    }
    void sirkulas_udara(){
        KondisiRuang udara = new KondisiRuang();
        System.out.println("Masukkan nilai Sirkulasi Udara dalam ruangan = ");
        udara.setSirkulasiUdara(in.nextInt());
        if(udara.getSirkulasiUdara()>=75){
            System.out.println("Sirkulasi Udara Lancar");
        }
        else{
            System.out.println("Sirkulasi ");
        }
    }
    void nilai_cahaya(){
        KondisiRuang chy = new KondisiRuang();
        System.out.println("Masukkan nilai Pencahayaan = ");
        chy.setNilaiPencahayaan(in.nextInt());
        if(chy.getNilaiPencahayaan()>=250 && chy.getNilaiPencahayaan()<=350){
            System.out.println("Sudah Sesuai");
            
        }
        else{
            System.out.println("Belum Sesuai");
        }
    }
    void lembap(){
        KondisiRuang lb = new KondisiRuang();
        System.out.println("Masukkan Nilai Kelembapan = ");
        lb.setKelembaban(in.nextInt());
        if(lb.getKelembaban()>=70 && lb.getKelembaban()<=80){
            System.out.println("Sudah Sesuai");
        }
        else{
            System.out.println("Belum Sesuai");
        }
    }
    void suhu(){
        KondisiRuang cls = new KondisiRuang();
        System.out.println("Masukkan Nilai Suhu = ");
        cls.setSuhu(in.nextInt());
        if(cls.getSuhu()>=25 && cls.getSuhu()<=35){
            System.out.println("Sudah Sesuai");
        }
        else{
            System.out.println("Belum Sesuai");
        }
    }
    void kebisingan(){
        KondisiRuang bsg = new KondisiRuang();
        System.out.println("Masukkan Nilai Kebisingan");
        bsg.setKebisingan(in.nextInt());
        if(bsg.getKebisingan()<=75){
            System.out.println("Tidak Bising");
        }
        else{
            System.out.println("Bising");
        }
    }
    void Smelll(){
        KondisiRuang b = new KondisiRuang();
        System.out.println("Masukkan Nilai Bau");
        b.setBau(in.nextInt());
        if(b.getBau()<=75){
            System.out.println("Ruangan Tidak Bau");
        }
        else{
            System.out.println("Ruangan Bau");
        }
    }
    void rusak(){
        KondisiRuang r = new KondisiRuang();
        System.out.println("Masukkan Nilai Kerusakan = ");
        r.setKerusakan(in.nextInt());
        if(r.getKerusakan()<=75){
            System.out.println("Tidak Rusang dan Sudah Sesuai");
        }
        else{
            System.out.println("Rusak dan Belum Sesuai");
        }
    }
    void bocor(){
        KondisiRuang bcr = new KondisiRuang();
        System.out.println("Masukkan Nilai Kebocoran = ");
        bcr.setKebocoran(in.nextInt());
        if(bcr.getKebocoran()<=75){
            System.out.println("Sudah Sesuai");
        }
        else{
            System.out.println("Sudah Sesuai");
        }
    }
    void aus(){
        KondisiRuang au = new KondisiRuang();
        System.out.println("Masukkan Nilai Keausan = ");
        au.setKeausan(in.nextInt());
        if(au.getKeausan()<=75){
            System.out.println("Sudah Sesuai");
        }
        else{
            System.out.println("Belum Sesuai");
        }
    }
    void kokoh(){
        KondisiRuang k = new KondisiRuang();
        System.out.println("Masukkan Nilai kekokohan = ");
        k.setKekokohan(in.nextInt());
        if(k.getKekokohan()>=75){
            System.out.println("Kokoh dan Sudah Sesuai");
        }
        else{
            System.out.println("Rapuh dan Belum Sesuai");
        }
    }
    
}
