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
        
        if(getJumlahsteker()>=4 && getKondisisteker()==2 && getPosisisteker()==1||getPosisisteker()==3){
            System.out.println("Sesuai");
            return 1;
            
        }
        else{
            System.out.println("Tidak sesuai");
            return 0;
        }
		}
  
     int Analisislcd(){
        
        if(getJumlahkabellcd()>=1 && getKondisikabellcd()==2 && getPosisikabellcd()==2 ){
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
            return 0;
        }
       
}
       
    
     int Analisislampu(){
        
        if(getJumlahlampu()>=18 && getKondisilampu()==2 && getPosisilampu()==2){
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
            return 0;
        }
    }
     int Analisiskipasangin(){
    
        if(getJumlahkipasangin()>=2 && getKondisikipasangin()==2 && getKondisikipasangin()==2){
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
			return 0;
        }
    }
     int Analisisac(){
    
        if(getJumlahac()>=1 && getKondisiac()==2 && getPosisiac()==4) {
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
			return 0;
        }
      
    }        
     int Analisisinternet(){
        
               
        if(getSSID()=="umm hotspot" && getLogin()==2 ){
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
            return 0;
        }
}
     int Analisiscctv(){

        if(getJumlahcctv()==2 && getKondisicctv()==2 && getPosisicctv()==1||getPosisicctv()==3){
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
            return 0;
        }
    }
     int pintu(){
    
        
               
        if(getJumlahpintu()>=2){
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
            return 0;
        }
        
        }
     int jendela(){
        
        
               
        if(getJumlahjendela()>=1){
            System.out.println("Sesuai");
            return 1;
        }
        else{
            System.out.println("Tidak sesuai");
            return 0;
        }
    
    }
}

   










