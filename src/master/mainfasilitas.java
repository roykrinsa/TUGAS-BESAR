
package master;


public class mainfasilitas {
    public static void main(String[] args) {
         analisisfasilitasruangan[] kelas=new analisisfasilitasruangan[1];
    
     
    kelas[0]=new analisisfasilitasruangan();
        for(int u=0;u<=kelas.length;u++){
       kelas[u].masukkan();
        kelas[u].Analisiskelistrikan();
         kelas[u].Analisislampu();
          kelas[u].Analisisac();
           kelas[u].Analisiscctv();
            kelas[u].Analisisinternet();
             kelas[u].Analisiskipasangin();
              kelas[u].Analisislcd();
               kelas[u].jendela();
                kelas[u].pintu();

    }
    
}
    }
    

