/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1point01;

/**
 *
 * @author ASUS
 */
public class T1point01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String[]nama = new String[5];
        nama[0]=" Ni Kadek Dwi Lestari";
        nama[1]=" Ni Luh Putu Cahya Kurnia Dwiyanti";
        nama[2]=" I Wayan Arta Gunarsa";
        nama[3]=" I Nyoman Agus Andi Permana P";
        nama[4]=" I GustiNgurah Nyoman Mega Putra J";
        
        
        //untuk memanggil array 1d
       for(int i = 0; i<nama.length;  i++)
       {
        System.out.println("Nama Mahasiswa :"+(nama[i]));
       }
    }
    
}
