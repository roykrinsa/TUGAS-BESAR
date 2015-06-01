package master;


import java.util.*;

public class analisisfasilitasruangan extends inputfasilitasruangan implements interfacefasilitas {
   public void data(){
    System.out.println("petunjuk.");
    System.out.println("angka 1=baik");
    System.out.println("angka 2=tidak baik");
}
    public void analisisfasilitasruangan(){
     masukkan();
     save();
     Analisiskelistrikan();
        
    
    Analisislcd();
    Analisislampu();
    Analisiskipasangin();
    Analisisac();
    Analisisinternet();
    Analisiscctv();
    pintu();
    jendela();
    }

    @Override
    public void input() {
        System.out.println("==================================================");
        masukkan(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("==================================================");
        
    }
    
    
    
    void Analisiskelistrikan(){ 
        
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
            System.out.println("tidak sesuai");}
    }
    void Analisisac(){
    
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
}
    }        
    void Analisisinternet(){
        
               
        if(o.getSSID()=="umm hotspot"){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
        if (o.getLogin()==2) {
            System.out.println("sesuai");
        }
        else{
            System.out.println("tidak sesuai");
        }
        
}
    void Analisiscctv(){

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
}
    }
    void pintu(){
    
        
               
        if(o.getJumlahpintu()>=2){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
        
        }
    void jendela(){
        
        
               
        if(o.getJumlahjendela()>=1){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak sesuai");
        }
    
    }
}

   










