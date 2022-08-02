/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;
/**
 *
 * @author LENOVO
 */
public class eksekusi {
    int hasil = 0; 
    public int cicilan(int harga, int dp, float bunga, int bulan,int admin){         
            int a=1;
            int harga2 = harga - dp;
            float bungaperbulan = harga * bunga/100;
            int pokok = harga2/bulan+admin;
            int angsuran= harga2/bulan;
            float totalangsuran = angsuran + bungaperbulan;
            float totalbayar = angsuran + bungaperbulan + admin;
            int sisaangsuran = harga2-angsuran*a;

            System.out.println("Bulan ke-" + a);
            System.out.println("Bunga Pinjaman Setiap Bulan : Rp." +bungaperbulan);       
            System.out.println("Besar Angsuran Setiap Bulan : Rp." +pokok);
            System.out.println("Besar Angsuran + Bunga      : Rp." +totalbayar);
            System.out.println("Sisa hutang                 : Rp." +sisaangsuran);
            System.out.println("");   
       
            for(int x=2;x<=bulan;x++) {
                int sisahutang = harga2-angsuran*x;
                System.out.println("Bulan ke-" + x);
                System.out.println("Bunga Pinjaman Setiap Bulan : Rp." +bungaperbulan);       
                System.out.println("Besar Angsuran Setiap Bulan : Rp." +angsuran);
                System.out.println("Besar Angsuran + Bunga      : Rp." +totalangsuran);
                System.out.println("Sisa hutang                 : Rp." +sisahutang);
                System.out.println("");
            }
       return hasil;
    }
}
