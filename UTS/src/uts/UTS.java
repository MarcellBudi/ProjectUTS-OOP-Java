/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class UTS {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int harga;
        int dp;
        float bunga;
        int bulan;
        int admin;
        
        harga =Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan harga mobil : " ));
        dp =Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Uang Muka : " ));
        bunga =Float.parseFloat(JOptionPane.showInputDialog(null,"Masukkan Bunga : " +"%"));
        bulan =Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Tenor : " +" bulan"));
        admin =Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan Biaya Administrasi : " ));
       
        rumus abcde = new rumus();
        System.out.println(abcde.hitung(harga,dp,((float)bunga),bulan,admin));
    }
}
