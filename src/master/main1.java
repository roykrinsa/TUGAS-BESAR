/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master;

/**
 *
 * @author ALMIGHTY
 */
public class main1 {
    public static analisisfasilitasruangan fasilitas = new analisisfasilitasruangan();
    public static analisakondisiruang kondisi = new analisakondisiruang();
    public static analisisidentitasruangan identitas =new analisisidentitasruangan();
    
    public static void main(String[] args) {
        fasilitas.analisisfasilitasruangan();
        kondisi.analisakondisiruang();
        identitas.analisisidentitasruangan();
    }
    
}
