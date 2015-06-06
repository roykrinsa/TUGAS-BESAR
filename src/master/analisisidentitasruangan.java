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
         if(obj.getKunci_pintu()==1)
     {System.out.println("sesuai"); 
     return 1;
     
             }
     else if(obj.getKunci_pintu()==0){
         System.out.println("tidak sesuai");
         return 0;
     }
     else{System.out.println("masukkan yang sesuai aturan!!");
     return 0;
     }
     }
int bahaya(){
    if(obj.getBahaya()==1){
        System.out.println("aman");
        return 1;
    }
    else if(obj.getBahaya()==0)
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
    if(obj.getJendela()==1){
        System.out.println("sesuai");
        return 1;
    }
    else if(obj.getJendela()==0){
        System.out.println("tidak sesuai");
        return 0;
    }
    else{System.out.println("masukkan yang sesuai aturan!!");
    return 0;
    }

}

    
}
