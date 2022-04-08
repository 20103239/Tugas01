/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1point02;


public class T1point02 {

   
    public static void main(String[] args) {
       String [][]data= new String[][]{
           {"Adi",  "127647", "Teknik Informatika"},
           {"Mika", "129883", "Sistem Komputer"},
           {"Budi", "120495",  "Teknik Informatika"},
           {"Bunga","123489",  "Sistem Komputer"},
       };       
      
       for (int x=0; x<data.length; x++){
            for (int y=0; y<data[x].length; y++){
               
                System.out.print(data[x][y]+"\t ");
            }
           
            System.out.println(""); 
             
       }
    }
}

               


    
    
    

