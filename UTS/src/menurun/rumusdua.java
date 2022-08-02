/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menurun;

/**
 *
 * @author LENOVO
 */
public class rumusdua {
    
    public int hasil = 0;
    int hitung(int harga, int dp, float bunga, int bulan, int admin){
      
      hitmenurun rumus = new hitmenurun();
      
      hasil = (int) rumus.bungamenurun( harga, dp, ((float)bunga), bulan, admin); 
      return hasil;
      
    }
}
