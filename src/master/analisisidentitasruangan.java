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
public class analisisidentitasruangan extends Input {
public void analisisidentitasruangan(){
       System.out.println("pintujendelabahaya");

  insertdatakuncipintujendelabahaya();
  cetakdatakuncipintujendelabahaya();
   analisiskuncipintu();
bahaya();
jendela();
   }
       
void analisiskuncipintu(){
         if(obj.getKunci_pintu()==1)
     {System.out.println("sesuai"); 
             }
     else if(obj.getKunci_pintu()==0){
         System.out.println("tidak sesuai");
     }
     else{System.out.println("masukkan yang sesuai aturan!!");
     }
     }
void bahaya(){
    if(obj.getBahaya()==1){
        System.out.println("aman");
    }
    else if(obj.getBahaya()==0)
    {
        System.out.println("bahaya");
    }
    else{System.out.println("masukkan yang sesuai aturan!!");}


   
}
void jendela(){
    if(obj.getJendela()==1){
        System.out.println("sesuai");
    }
    else 
        if(obj.getJendela()==0){
        System.out.println("tidak sesuai");
    }
    else{System.out.println("masukkan yang sesuai aturan!!");}

}

    
}
