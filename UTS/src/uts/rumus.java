/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author LENOVO
 */
public class rumus {
    public int hasil = 0;
    int hitung(int harga, int dp, float bunga, int bulan, int admin){
      
      eksekusi rumus = new eksekusi();
      
      hasil = (int) rumus.cicilan( harga, dp, ((float)bunga), bulan, admin); 
      return hasil;
    }
}
