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
      

  insertdatakuncipintujendelabahaya();
  
   analisiskuncipintu();
bahaya();
jendela();
   }
       
int analisiskuncipintu(){
         if(getKunci_pintu()==1)
     {System.out.println("ada"); 
     return 1;
     
             }
     else if(getKunci_pintu()==0){
         System.out.println("tidak ada");
         return 0;
     }
     else{System.out.println("masukkan yang sesuai aturan!!");
     return 0;
     }
     }
int bahaya(){
    if(getBahaya()==1){
        System.out.println("aman");
        return 1;
    }
    else if(getBahaya()==0)
    {
        System.out.println("bahaya");
        return 0;
    }
    else{
        System.out.println("masukkan yang sesuai aturan!!");
        return 0;
    }


   
}
int jendela(){
    if(getJendela()==1){
        System.out.println("ada");
        return 1;
    }
    else if(getJendela()==0){
        System.out.println("tidak ada");
        return 0;
    }
    else{System.out.println("masukkan yang sesuai aturan!!");
    return 0;
    }

}

    
}
