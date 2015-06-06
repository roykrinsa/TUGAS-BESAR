package master;


import java.util.*;

public class analisisfasilitasruangan extends inputfasilitasruangan implements interfacefasilitas {
   @Override
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
    int Analisiskelistrikan(){ 
        
        if(o.getJumlahsteker()>=4 && o.getKondisisteker()==2 && o.getPosisisteker()==1||o.getPosisisteker()==3){
            System.out.println("Sesuai");
            return 1;
            
        }
        else{
            System.out.println("Tidak sesuai");
            return 0;
        }
		}
  
     int Analisislcd(){
        
        if(o.getJumlahkabellcd()>=1 && o.getKondisikabellcd()==2 && o.getPosisikabellcd()==2 ){
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
            return 0;
        }
       
}
       
    
     int Analisislampu(){
        
        if(o.getJumlahlampu()>=18 && o.getKondisilampu()==2 && o.getPosisilampu()==2){
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
            return 0;
        }
    }
     int Analisiskipasangin(){
    
        if(o.getJumlahkipasangin()>=2 && o.getKondisikipasangin()==2 && o.getKondisikipasangin()==2){
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
			return 0;
        }
    }
     int Analisisac(){
    
        if(o.getJumlahac()>=1 && o.getKondisiac()==2 && o.getPosisiac()==4) {
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
			return 0;
        }
      
    }        
     int Analisisinternet(){
        
               
        if(o.getSSID()=="umm hotspot" && o.getLogin()==2 ){
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
            return 0;
        }
}
     int Analisiscctv(){

        if(o.getJumlahcctv()==2 && o.getKondisicctv()==2 && o.getPosisicctv()==1||o.getPosisicctv()==3){
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
            return 0;
        }
    }
     int pintu(){
    
        
               
        if(o.getJumlahpintu()>=2){
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
            return 0;
        }
        
        }
     int jendela(){
        
        
               
        if(o.getJumlahjendela()>=1){
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
            return 0;
        }
    
    }
}

   










