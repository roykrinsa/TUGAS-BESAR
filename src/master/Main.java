
package master;


public class Main {
    public static void main(String[] args) {
    Input[] Input=new Input[1];
    analisisidentitasruangan[] analisa =new analisisidentitasruangan[1];
    analisa[0]=new analisisidentitasruangan();
   
        for(int u=0;u<=analisa.length;u++){
        analisa[u].analisiskuncipintu();
        analisa[u].bahaya();
        analisa[u].jendela();
        analisa[u].cetakdatakuncipintujendelabahaya();
    }
    
}
}
