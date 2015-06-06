package master;

import java.io.Serializable;


public class identitas_ruangan implements Serializable {

String namaruangan;
String lokasi_ruangan;
String program_studi;
int kunci_pintu;
int jendela;
int bahaya;
identitas_ruangan(){
    
}
public String getNamaruangan() {
        return namaruangan;
    }

    public void setNamaruangan(String namaruangan) {
        this.namaruangan = namaruangan;
    }

    public String getLokasi_ruangan() {
        return lokasi_ruangan;
    }

    public void setLokasi_ruangan(String lokasi_ruangan) {
        this.lokasi_ruangan = lokasi_ruangan;
    }

    public String getProgram_studi() {
        return program_studi;
    }

    public void setProgram_studi(String program_studi) {
        this.program_studi = program_studi;
    }

    public int getKunci_pintu() {
        return kunci_pintu;
    }

    public void setKunci_pintu(int kunci_pintu) {
        this.kunci_pintu = kunci_pintu;
    }

    public int getJendela() {
        return jendela;
    }

    public void setJendela(int jendela) {
        this.jendela = jendela;
    }

    public int getBahaya() {
        return bahaya;
    }

    public void setBahaya(int bahaya) {
        this.bahaya = bahaya;
    }
    public void identitas(String nama_ruangan,String lokasi_ruangan,String program_studi){
        this.namaruangan=namaruangan;
        this.lokasi_ruangan=lokasi_ruangan;
        this.program_studi=program_studi;
}
    public void secure(int kunci_pintu, int bahaya,int jendela){
        this.kunci_pintu=kunci_pintu;
        this.bahaya=bahaya;
        this.jendela=jendela;
        
    }
    
}
